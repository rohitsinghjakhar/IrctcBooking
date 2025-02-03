package com.irctcbooking.booking.controller;

import com.irctcbooking.booking.entity.Trains;
import com.irctcbooking.booking.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/trains")
public class TrainController {
    @Autowired
    private TrainService trainService;

    @PostMapping("/add")
    public Trains addTrain(@RequestBody Trains train) {
        return trainService.addTrain(train);
    }

    @GetMapping("/availability")
    public List<Trains> getTrains(@RequestParam String source, @RequestParam String destination) {
        return trainService.getTrains(source, destination);
    }
}