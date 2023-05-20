package com.example.demo.service;

import com.example.demo.data.model.Movies;

import java.util.List;

public interface MoviesService {

    /*
     * TODO.
     *@param movies TODO.
     *@return TODO.
     * */
    Movies createMovie(Movies movies); //create

    Movies retrieveByMoviesId(Long id); //read
    List<Movies> retrieveAllMovies(); // read

    Movies update(Movies movies); // update

    void deleteMoviesById(Long id); // delete
}

