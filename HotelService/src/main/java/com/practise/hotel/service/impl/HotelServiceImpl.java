package com.practise.hotel.service.impl;

import com.practise.hotel.service.entities.Hotel;
import com.practise.hotel.service.exceptions.ResourceNotFoundException;
import com.practise.hotel.service.repositories.HotelRepo;
import com.practise.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel addHotel(Hotel hotel) {
        String generatedId = UUID.randomUUID().toString();
        hotel.setHotelId(generatedId);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> fetchAllHotels() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel fetchHotelById(String hotelId) {
        return hotelRepo.findById(hotelId).orElseThrow(
                () -> new ResourceNotFoundException("cannot find hotel with id: "+ hotelId));
    }
}
