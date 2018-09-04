package com.example.demo.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Movie {

    @NotNull
    @Min(value = 1)
    private int id;

    @NotNull
    @Size(min = 2, max = 150)
    private String name;

    @NotNull
    @Size(min = 4, max = 100)
    private String genre;

    @NotNull
    @Min(value = 1888)
    @Max(value = 2018)
    private int year;

    @NotNull
    @Min(value = 0)
    @Max(value = 5)
    private double rating;

    @NotNull
    @Min(value = 5)
    @Max(value = 240)
    private double duration;

    @NotNull
    @Size(min = 10, max = 500)
    private String imgUrl;

    @NotNull
    @Size(min = 10, max = 10000)
    private String movieDescription;


    public Movie(){
        //default
    }

    public Movie(int id, String name, String genre, int year, double rating, double duration, String imgUrl, String movieDescription){
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.duration = duration;
        this.imgUrl = imgUrl;
        this.movieDescription = movieDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
