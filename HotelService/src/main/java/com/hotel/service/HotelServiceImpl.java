package com.hotel.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entities.Hotel;
import com.hotel.exceptions.ResourceNotFooundException;
import com.hotel.repository.HotelRepository;

/**
 * HotelServiceImpl
 */
@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);    

        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getSigngleHotel(String hotelId) {
        
        return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFooundException("Hotel is Not present with given id "+hotelId));
    }

    
}