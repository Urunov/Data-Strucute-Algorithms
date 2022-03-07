package io.namoosori.project.travel.store.dbstore;

import io.namoosori.project.travel.aggregate.CommunityMember;
import io.namoosori.project.travel.exception.EntityNotFoundException;
import io.namoosori.project.travel.store.MemberStore;
import io.namoosori.project.travel.store.jpo.CommunityMemberJpo;
import io.namoosori.project.travel.store.jpo.TravelClubJpo;
import io.namoosori.project.travel.store.repository.CommunityMemberRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/10 && 11:27 PM}
 */

@Repository
public class CommunityMemberStore implements MemberStore {
    //
    @Autowired
    CommunityMemberRepository communityMemberRepository;

    @Override
    public CommunityMember save(CommunityMember member) {
        //
        CommunityMemberJpo communityMember = new CommunityMemberJpo(member);
        communityMemberRepository.save(communityMember);
        return communityMember.toDomain();
    }

    @Override
    public List<CommunityMember> saveList(List<CommunityMember> members) {
        //

        return null;
    }

    @Override
    public List<CommunityMember> retrieveByName(String name) {
        //
        List<CommunityMemberJpo> jpos = communityMemberRepository.findByName(name);

        return CommunityMemberJpo.toDomains(jpos);
    }

    @Override
    public CommunityMember retrieveById(Long id) {
        //
        CommunityMemberJpo communityMemberJpo = communityMemberRepository.getById(id);
        if (communityMemberJpo.getName()==null || communityMemberJpo.getName().isEmpty()){
            throw new EntityNotFoundException("Community member not found with id: " + id);
        }
        return communityMemberJpo.toDomain();
    }

    @Override
    public CommunityMember modify(CommunityMember communityMember) {
        //
        CommunityMemberJpo communityMemberJpo = communityMemberRepository.getById(communityMember.getId());

        if(communityMemberJpo.getName()==null || communityMemberJpo.getName().isEmpty()){
            throw new EntityNotFoundException("Community not found with id: " + communityMember.getId());
        }
        BeanUtils.copyProperties(communityMember, communityMemberJpo);

        communityMemberRepository.save(communityMemberJpo);
        return communityMemberJpo.toDomain();
    }

    @Override
    public boolean exists(Long id) {
        //
        CommunityMemberJpo communityMemberJpo = communityMemberRepository.getById(id);
        if(communityMemberJpo.getName()==null || communityMemberJpo.getName().isEmpty()){
            throw new EntityNotFoundException("Community not found with id: " + communityMemberJpo.getId());
        }
        return true;
    }
}
