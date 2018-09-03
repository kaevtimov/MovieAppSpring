package com.example.demo.services;

import com.example.demo.models.Movie;
import com.example.demo.repositories.base.MovieRepository;
import com.example.demo.services.base.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;

    @Autowired
    public MovieServiceImpl(MovieRepository repository){
        this.repository = repository;
    }

    @Override
    public void create(Movie movie) {
        this.repository.create(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return this.repository.getAllMovies();
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
    }

    @Override
    public Movie getMovieById(int id) {
        return this.repository.getMovieById(id);
    }

    @Override
    public void updateMovie(int id, Movie movie) {
        this.repository.updateMovie(id, movie);
    }
}
