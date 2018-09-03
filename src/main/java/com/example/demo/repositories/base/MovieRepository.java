package com.example.demo.repositories.base;

import com.example.demo.models.Movie;

import java.util.List;

public interface MovieRepository {

    List<Movie> getAllMovies();

    Movie getMovieById(int id);

    void create(Movie movie);

    void delete(int id);

    void updateMovie(int id, Movie movie);
}
