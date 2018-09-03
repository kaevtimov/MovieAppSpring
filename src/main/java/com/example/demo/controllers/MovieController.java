package com.example.demo.controllers;


import com.example.demo.models.Movie;
import com.example.demo.services.base.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService service;

    @Autowired
    public MovieController(MovieService service){
        this.service = service;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Movie> getAll(){
        return service.getAllMovies();
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public Movie postMovie(@RequestBody Movie movie){
        service.create(movie);
        return movie;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Movie getMovieById(@PathVariable(value = "id") int id){
        return service.getMovieById(id);
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    public void deleteMovie(@PathVariable(value = "id") int id){
        service.delete(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public void updateMovie(@RequestBody Movie movie, @PathVariable(value = "id") int id){
        service.updateMovie(id, movie);
    }
}
