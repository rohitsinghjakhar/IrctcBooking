package com.irctcbooking.booking.repository;

import com.irctcbooking.booking.entity.Trains;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TrainRepository extends JpaRepository<Trains, Long> {
    List<Trains> findBySourceAndDestination(String source, String destination);
}