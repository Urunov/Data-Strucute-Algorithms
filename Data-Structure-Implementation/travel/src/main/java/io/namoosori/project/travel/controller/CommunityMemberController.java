package io.namoosori.project.travel.controller;

import io.namoosori.project.travel.aggregate.CommunityMember;
import io.namoosori.project.travel.aggregate.TravelClub;
import io.namoosori.project.travel.service.CommunityMemberService;
import io.namoosori.project.travel.store.jpo.CommunityMemberJpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/10 && 11:27 PM}
 */
@RestController
@RequestMapping("/api/v1/member")
public class CommunityMemberController {
    //
    @Autowired
    CommunityMemberService communityMemberService;

    @PostMapping("/add")
    ResponseEntity<CommunityMember> createMember(@RequestBody CommunityMember communityMember){
        //
        communityMember = communityMemberService.register(communityMember);
        return ResponseEntity.ok(communityMember);
    }

}
