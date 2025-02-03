package com.irctcbooking.booking.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookings")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long trainId;
    private int seatsBooked;


    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }
}