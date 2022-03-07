package io.namoosori.project.travel.store;

import io.namoosori.project.travel.aggregate.CommunityMember;

import java.util.List;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/10 && 11:03 PM}
 */
public interface MemberStore {
    //
    CommunityMember save(CommunityMember member);
    List<CommunityMember> saveList(List<CommunityMember> members);
    List<CommunityMember> retrieveByName(String name);
    CommunityMember retrieveById(Long id);
    CommunityMember modify(CommunityMember communityMember);
    boolean exists(Long id);
}
