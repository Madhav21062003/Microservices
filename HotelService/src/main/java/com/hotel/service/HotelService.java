package com.hotel.service;

import java.util.List;

import com.hotel.entities.Hotel;

public interface HotelService {
    
    Hotel create(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel getSigngleHotel(String hotelId);

}
