package io.namoosori.project.travel.store.repository;

import io.namoosori.project.travel.store.jpo.TravelClubJpo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Company: {Nextree inc.}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/07 && 9:13 PM}
 */

public interface TravelClubRepository extends JpaRepository<TravelClubJpo, Long> {
    //
    List<TravelClubJpo> findAllByNameContains(String name);
}