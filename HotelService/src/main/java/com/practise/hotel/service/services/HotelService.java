package com.practise.hotel.service.services;

import com.practise.hotel.service.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    Hotel addHotel(Hotel hotel);

    List<Hotel> fetchAllHotels();

    Hotel fetchHotelById(String hotelId);
}
