package com.practise.hotel.service.controllers;

import com.practise.hotel.service.entities.Hotel;
import com.practise.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        Hotel addedHotel = hotelService.addHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedHotel);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
        Hotel fetchedhotel = hotelService.fetchHotelById(hotelId);
        return ResponseEntity.status(HttpStatus.FOUND).body(fetchedhotel);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> allHotels = hotelService.fetchAllHotels();
        return ResponseEntity.status(HttpStatus.FOUND).body(allHotels);
    }
}
