package io.namoosori.project.travel.store.repository;

import io.namoosori.project.travel.aggregate.CommunityMember;
import io.namoosori.project.travel.store.jpo.CommunityMemberJpo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/10 && 11:24 PM}
 */
public interface CommunityMemberRepository extends JpaRepository<CommunityMemberJpo, Long> {
    //
    List<CommunityMemberJpo> findByName(String name);
}
