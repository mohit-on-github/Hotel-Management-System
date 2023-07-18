package com.practise.rating.service.RatingService.services;

import com.practise.rating.service.RatingService.entities.Rating;

import javax.swing.event.ListDataEvent;
import java.util.List;

public interface RatingService {

    Rating addRating(Rating rating);

    List<Rating> fetchAllRatings();

    List<Rating> fetchRatingsByUserId(String userId);

    List<Rating> fetchRatingsByHotelId(String HotelId);
}
