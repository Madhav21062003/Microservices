package com.rating.controller;

import com.rating.entities.Rating;
import com.rating.service.RatingService;
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

    // CREATE Controller
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){

        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
    }

    // GET All Ratings
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        return ResponseEntity.status(HttpStatus.FOUND).body(ratingService.getAllRatings());
    }

    // GET Rating By User
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        return ResponseEntity.status(HttpStatus.FOUND).body(ratingService.getRatingByUserId(userId));
    }

    // GET Rating By Hotel
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.FOUND).body(ratingService.getRatingByHotelId(hotelId));
    }





}
