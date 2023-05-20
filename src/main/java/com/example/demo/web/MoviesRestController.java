package com.example.demo.web;

import com.example.demo.data.model.Movies;
import com.example.demo.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MoviesRestController {

    private final MoviesService moviesService;
    @Autowired
    public MoviesRestController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    //CRUD

    @GetMapping("/{id}")
    public Movies getMoviesById(@PathVariable Long id){
        return moviesService.retrieveByMoviesId(id);
    }

    @PostMapping
    public Movies createMovies(@RequestBody Movies movies){
        return moviesService.createMovie(movies);
    }

    @GetMapping
    public List<Movies> getAllMovies(){
        return moviesService.retrieveAllMovies();
    }

    @PutMapping //meglevo eroforrast modositunk ezzel
    public Movies updateMovies(@RequestBody Movies movies){
        return moviesService.update(movies);
    }

    @DeleteMapping("/{id}")
    public void deleteMoviesById(@PathVariable Long id){
        moviesService.deleteMoviesById(id);
    }

}
