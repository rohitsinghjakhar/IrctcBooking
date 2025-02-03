package com.irctcbooking.booking.dto;


import lombok.Data;

@Data
public class LoginResponse {
    private String message;
    private String token;
}