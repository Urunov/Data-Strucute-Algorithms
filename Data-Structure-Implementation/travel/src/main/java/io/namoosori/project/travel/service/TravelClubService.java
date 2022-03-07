package io.namoosori.project.travel.service;

import io.namoosori.project.travel.aggregate.TravelClub;

import java.util.List;

/**
 * @Company: {Nextree }
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/07 && 10:47 PM}
 */
public interface TravelClubService {
    //
    TravelClub register(TravelClub travelClub);
    List<TravelClub> registerList(List<TravelClub> travelClubs);
    TravelClub findById(Long id);
    List<TravelClub> findByName(String name);
    TravelClub updateClubInfo(TravelClub travelClub);
    boolean remove(Long id);
}
