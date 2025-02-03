package com.irctcbooking.booking.service;

import com.irctcbooking.booking.entity.Booking;
import com.irctcbooking.booking.entity.Trains;
import com.irctcbooking.booking.repository.BookingRepository;
import com.irctcbooking.booking.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingService {
    @Autowired
    private TrainRepository trainRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Transactional
    public synchronized Booking bookSeat(Long userId, Long trainId, int seats) {
        Trains train = trainRepository.findById(trainId).orElseThrow(() -> new RuntimeException("Train not found"));
        if (train.getAvailableSeats() >= seats) {
            train.setAvailableSeats(train.getAvailableSeats() - seats);
            trainRepository.save(train);

            Booking booking = new Booking();
            booking.setUserId(userId);
            booking.setTrainId(trainId);
            booking.setSeatsBooked(seats);
            return bookingRepository.save(booking);
        } else {
            throw new RuntimeException("Not enough seats available");
        }
    }
}