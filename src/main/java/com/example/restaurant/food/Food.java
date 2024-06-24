package com.example.restaurant.food;

import jakarta.persistence.*;
import java.util.UUID;

@Table(name = "food")
@Entity(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String image;
    private Integer price;

    // Getters and Setters
}
