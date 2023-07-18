package com.practise.rating.service.RatingService.Impl;

import com.practise.rating.service.RatingService.entities.Rating;
import com.practise.rating.service.RatingService.repositories.RatingRepo;
import com.practise.rating.service.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;
    @Override
    public Rating addRating(Rating rating) {
        String generatedRatingId = UUID.randomUUID().toString();
        rating.setRatingId(generatedRatingId);
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> fetchAllRatings() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> fetchRatingsByUserId(String userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> fetchRatingsByHotelId(String hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
