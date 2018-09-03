package com.example.demo.services.base;

import com.example.demo.models.Movie;

import java.util.List;

public interface MovieService {

    void create(Movie movie);

    List<Movie> getAllMovies();

    void delete(int id);

    Movie getMovieById(int id);

    void updateMovie(int id, Movie movie);
}
