package io.namoosori.project.travel.service.logic;

import io.namoosori.project.travel.aggregate.TravelClub;
import io.namoosori.project.travel.service.TravelClubService;
import io.namoosori.project.travel.store.TravelClubStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Company: {Nextree }
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/07 && 10:46 PM}
 */
@Service
public class TravelClubServiceLogic implements TravelClubService {
    //
    @Autowired
    TravelClubStore travelClubStore;

    @Override
    public TravelClub register(TravelClub travelClub) {
        return travelClubStore.save(travelClub);
    }

    @Override
    public List<TravelClub> registerList(List<TravelClub> travelClubs) {
        return travelClubStore.saveList(travelClubs);
    }

    @Override
    public TravelClub findById(Long id) {
        return travelClubStore.retrieveById(id);
    }

    @Override
    public List<TravelClub> findByName(String name) {
        return travelClubStore.retrieveByName(name);
    }

    @Override
    public TravelClub updateClubInfo(TravelClub travelClub) {
        return travelClubStore.modify(travelClub);
    }

    @Override
    public boolean remove(Long id) {
        return travelClubStore.remove(id);
    }
}
