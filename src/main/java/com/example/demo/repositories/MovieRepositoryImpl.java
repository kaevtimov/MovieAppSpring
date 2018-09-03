package com.example.demo.repositories;

import com.example.demo.models.Movie;
import com.example.demo.repositories.base.MovieRepository;
import com.example.demo.utils.IdGenerator;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private List<Movie> movies;
    private IdGenerator generator;


    public MovieRepositoryImpl(){
        this.generator = new IdGenerator();
        this.movies = new ArrayList<>();
        loadMovies();
    }


    @Override
    public List<Movie> getAllMovies() {
        return this.movies;
    }

    @Override
    public Movie getMovieById(int id) {
        return getMovie(id);
    }

    @Override
    public void create(Movie movie) {
        movie.setId(generator.getNextId());
        this.movies.add(movie);
    }

    @Override
    public void delete(int id) {
        Movie movie = getMovie(id);
        movies.remove(movie);
    }

    @Override
    public void updateMovie(int id, Movie movie) {
        Movie m = getMovie(id);
        int index = movies.indexOf(m);
        movies.set(index, m);
    }


    private Movie getMovie(int id){
        return movies.stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .orElse(null);
    }


    private void loadMovies() {
        //add movies(20)
    }
}
