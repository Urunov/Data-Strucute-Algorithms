package io.namoosori.project.travel.service;

import io.namoosori.project.travel.aggregate.CommunityMember;
import io.namoosori.project.travel.aggregate.TravelClub;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/10 && 11:27 PM}
 */
public interface CommunityMemberService {
    //
    CommunityMember register(CommunityMember communityMember);
    List<CommunityMember> registerList(List<CommunityMember> communityMembers);
    CommunityMember findById(Long id);
    List<CommunityMember> findByName(String name);
    CommunityMember updateClubInfo(CommunityMember communityMember);
    boolean remove(Long id);
}
