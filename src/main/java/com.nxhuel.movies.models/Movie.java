package com.nxhuel.movies.models;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private int year;
    private int votes;
    private double rating;
    @Column(name = "image_url")
    private String imageUrl;
}