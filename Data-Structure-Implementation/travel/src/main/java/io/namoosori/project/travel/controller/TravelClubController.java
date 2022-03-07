package io.namoosori.project.travel.controller;

import io.namoosori.project.travel.aggregate.TravelClub;
import io.namoosori.project.travel.service.TravelClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {travel}
 * @Date: {2022/02/07 && 8:58 PM}
 */
@RestController
@RequestMapping("/api/v2/club")
public class TravelClubController {
    //
    @Autowired
    TravelClubService travelClubService;

    @PostMapping("/add")
    public ResponseEntity<TravelClub> createTravelClub(@RequestBody TravelClub travelClub){
       travelClub = travelClubService.register(travelClub);
        return ResponseEntity.ok(travelClub);
    }

    @PostMapping("/clubs")
    public ResponseEntity<List<TravelClub>> createTravelClubList(@RequestBody List<TravelClub> travelClubList){
        travelClubList = travelClubService.registerList(travelClubList);
        return ResponseEntity.ok(travelClubList);
    }

    @GetMapping("/club/{id}")
    TravelClub getClubById(@PathVariable Long id){
        TravelClub travelClub = travelClubService.findById(id);
        return travelClub;
    }

    @GetMapping("/club/Name")
    List<TravelClub> getClubsByName(@RequestParam String clubName){
        //
        return travelClubService.findByName(clubName);
    }

    @PutMapping("/club")
    TravelClub updateClubInfo(@RequestBody TravelClub travelClub){
        //
        return travelClubService.updateClubInfo(travelClub);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deleteClub(@PathVariable Long id){
        //
        boolean result = travelClubService.remove(id);
        String response = "";
        if (result){
            response = "Club removed sucessful";
        } else {
            response = "Error occur while deleting club";
        }
        return ResponseEntity.ok(response);
    }
}
