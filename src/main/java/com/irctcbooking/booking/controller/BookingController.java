package com.irctcbooking.booking.controller;

import com.irctcbooking.booking.entity.Booking;
import com.irctcbooking.booking.entity.Trains;
import com.irctcbooking.booking.repository.BookingRepository;
import com.irctcbooking.booking.repository.TrainRepository;
import com.irctcbooking.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public Booking bookSeat(@RequestParam Long userId, @RequestParam Long trainId, @RequestParam int seats) {
        return bookingService.bookSeat(userId, trainId, seats);
    }
}