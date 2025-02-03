package com.irctcbooking.booking.service;


import com.irctcbooking.booking.entity.Trains;
import com.irctcbooking.booking.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    @Autowired
    private TrainRepository trainRepository;

    public Trains addTrain(Trains train) {
        return trainRepository.save(train);
    }

    public List<Trains> getTrains(String source, String destination) {
        return trainRepository.findBySourceAndDestination(source, destination);
    }
}