package com.rating.service;

import com.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    // CREATE RATING
    Rating createRating(Rating rating);

    // GET ALL Ratings
    List<Rating> getAllRatings();

    // GET ALL Bu User Id
    List<Rating> getRatingByUserId(String userId);

    // GET all by hotel
    List<Rating> getRatingByHotelId(String hotelId);

}
