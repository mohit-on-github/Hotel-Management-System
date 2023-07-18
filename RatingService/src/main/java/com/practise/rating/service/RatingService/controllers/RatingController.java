package com.practise.rating.service.RatingService.controllers;

import com.practise.rating.service.RatingService.entities.Rating;
import com.practise.rating.service.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating){
        Rating addedRating = ratingService.addRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedRating);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        List<Rating> allRatings = ratingService.fetchAllRatings();
        return ResponseEntity.status(HttpStatus.FOUND).body(allRatings);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUser(@PathVariable String userId){
        List<Rating> ratingsByUserId = ratingService.fetchRatingsByUserId(userId);
        return ResponseEntity.status(HttpStatus.FOUND).body(ratingsByUserId);
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotel(@PathVariable String hotelId){
        List<Rating> ratingsByHotelId = ratingService.fetchRatingsByHotelId(hotelId);
        return  ResponseEntity.status(HttpStatus.FOUND).body(ratingsByHotelId);
    }
}
