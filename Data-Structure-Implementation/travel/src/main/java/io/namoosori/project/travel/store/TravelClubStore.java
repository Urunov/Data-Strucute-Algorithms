package io.namoosori.project.travel.store;

import io.namoosori.project.travel.aggregate.TravelClub;

import java.util.List;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/07 && 8:51 PM}
 */
public interface TravelClubStore {
    //
    TravelClub save(TravelClub travelClub);
    List<TravelClub > saveList(List<TravelClub> travelClubList);
    List<TravelClub> retrieveByName(String name);
    TravelClub retrieveById(Long id);
    TravelClub modify(TravelClub travelClub);
    boolean remove(Long id);
    boolean exists(Long id);
}
