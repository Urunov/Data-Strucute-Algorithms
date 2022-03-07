package io.namoosori.project.travel.store.jpo;

import io.namoosori.project.travel.aggregate.TravelClub;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/07 && 9:14 PM}
 */

@Entity
@Getter
@Setter
@Table(name = "travel")
@NoArgsConstructor
@AllArgsConstructor
public class TravelClubJpo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "club_name", columnDefinition = "VARCHAR(25)")
    private String name;

    @Column(name = "club_intro", columnDefinition = "VARCHAR(100)")
    private String intro;

//    public TravelClubJpo(TravelClub travelClub) {
//        //
//        // step-1: Simple this
//       /**
//        this.name = travelClub.getName();
//        this.intro = travelClub.getIntro();
//        */
//        // step-2: BeanUtils
//        BeanUtils.copyProperties(travelClub, this);
//    }

//    public TravelClub toDomain(){
//
//        TravelClub travelClub = new TravelClub();
//        // step-1: object setting
//       /**
//        travelClub.setName(this.name);
//        travelClub.setIntro(this.intro);
//        */
//
//        // step-2: BeanUtils
//        BeanUtils.copyProperties(this, travelClub);
//
//        return travelClub;
//    }

    public TravelClubJpo(TravelClub travelClub) {
        this.intro = travelClub.getIntro();
        this.name = travelClub.getName();
       // BeanUtils.copyProperties(travelClub, this);
    }

    public TravelClub toDomain() {

        TravelClub travelClub = new TravelClub();
        travelClub.setId(this.id);
        travelClub.setName(this.name);
        travelClub.setIntro(this.intro);
       // BeanUtils.copyProperties(this, travelClub);

        return travelClub;
    }

    public static List<TravelClub> toDomains(List<TravelClubJpo> jpos){
        // Lambda method.
        return jpos
                .stream()
                .map(TravelClubJpo::toDomain) // static method call.
                .collect(Collectors.toList());
    }

    public static List<TravelClub> toDomainV2(List<TravelClubJpo> jpos){
        // Simple way
        List<TravelClub> result = new ArrayList<>();
        for (TravelClubJpo tv: jpos){
            TravelClub club = tv.toDomain();
            result.add(club);
        }
        return result;
    }

    public static List<TravelClubJpo> fromDomains(List<TravelClub> travelClubs) {
        //
        return travelClubs
                .stream()
                .map(TravelClubJpo::new)
                .collect(Collectors.toList());
    }

    public static List<TravelClubJpo> fromDomains2(List<TravelClub> travelClubList){
        //
        List<TravelClubJpo> travelCLubJpos = new ArrayList<>();

        for (TravelClub club: travelClubList){
            TravelClubJpo jpo = new TravelClubJpo(club);
            travelCLubJpos.add(jpo);
        }
        return travelCLubJpos;

    }
}
