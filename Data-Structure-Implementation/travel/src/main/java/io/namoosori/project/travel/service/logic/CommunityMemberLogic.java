package io.namoosori.project.travel.service.logic;

import io.namoosori.project.travel.aggregate.CommunityMember;
import io.namoosori.project.travel.service.CommunityMemberService;
import io.namoosori.project.travel.store.dbstore.CommunityMemberStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/12 && 9:55 PM}
 */
@Service
public class CommunityMemberLogic implements CommunityMemberService {
    //
    @Autowired
    CommunityMemberStore communityMemberStore;

    @Override
    public CommunityMember register(CommunityMember communityMember) {
        return communityMemberStore.save(communityMember);
    }

    @Override
    public List<CommunityMember> registerList(List<CommunityMember> communityMembers) {
        return null;
    }

    @Override
    public CommunityMember findById(Long id) {
        return null;
    }

    @Override
    public List<CommunityMember> findByName(String name) {
        return null;
    }

    @Override
    public CommunityMember updateClubInfo(CommunityMember communityMember) {
        return null;
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }
}
