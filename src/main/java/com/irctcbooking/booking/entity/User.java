package com.irctcbooking.booking.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passengers")
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;

    public String getPassword() {
        return password;
    }

    // Setter method for password (if needed)
    public void setPassword(String password) {
        this.password = password;
    }
}