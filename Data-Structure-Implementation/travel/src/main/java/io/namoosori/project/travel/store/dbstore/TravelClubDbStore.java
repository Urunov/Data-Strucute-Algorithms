package io.namoosori.project.travel.store.dbstore;

import io.namoosori.project.travel.aggregate.TravelClub;
import io.namoosori.project.travel.exception.EntityNotFoundException;
import io.namoosori.project.travel.store.TravelClubStore;
import io.namoosori.project.travel.store.jpo.TravelClubJpo;
import io.namoosori.project.travel.store.repository.TravelClubRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @Company: {Nextree }
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/07 && 9:23 PM}
 */

@Repository
@Transactional
public class TravelClubDbStore implements TravelClubStore {
    //
    @Autowired
    TravelClubRepository travelClubRepository;

    @Override
    public TravelClub save(TravelClub travelClub) {
        TravelClubJpo travelClubJpo = new TravelClubJpo(travelClub);
        travelClubRepository.save(travelClubJpo);

        return  travelClubJpo.toDomain();
    }

    @Override
    public List<TravelClub> saveList(List<TravelClub> travelClubList) {
        List<TravelClubJpo> jpos = TravelClubJpo.fromDomains(travelClubList);
        jpos = travelClubRepository.saveAll(jpos);

        return TravelClubJpo.toDomains(jpos);
    }

    @Override
    public List<TravelClub> retrieveByName(String name) {
        List<TravelClubJpo> jpos = travelClubRepository.findAllByNameContains(name);

        return TravelClubJpo.toDomains(jpos);
    }

    @Override
    public TravelClub retrieveById(Long id) {
        TravelClubJpo travelClubJpo = travelClubRepository.getById(id);
        if (travelClubJpo.getName()==null || travelClubJpo.getName().isEmpty()){
            throw new EntityNotFoundException("Travel club not found with id: " + id);
        }

        return travelClubJpo.toDomain();
    }

    @Override
    public TravelClub modify(TravelClub travelClub) {
        TravelClubJpo jpo = travelClubRepository.getById(travelClub.getId());
        if (jpo.getName() == null || jpo.getName().isEmpty()){
            throw new EntityNotFoundException("Travel Club not found with id: " + travelClub.getId());

        }

        BeanUtils.copyProperties(travelClub, jpo);

        return jpo.toDomain();
    }

    @Override
    public boolean remove(Long id) {
        //
        try{
            TravelClubJpo travelClubJpo = travelClubRepository.getById(id);
            if (travelClubJpo.getName() == null || travelClubJpo.getName().isEmpty()){
                return false;
            }
            travelClubRepository.delete(travelClubJpo);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean exists(Long id) {
        TravelClubJpo travelClubJpo = travelClubRepository.getById(id);
        if (travelClubJpo.getId() == null ){
            throw new EntityNotFoundException("No found id " + id);
        }

        return travelClubRepository.existsById(id);
    }
}
