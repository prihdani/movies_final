package com.example.demo.service.impl;

import com.example.demo.data.model.Movies;
import com.example.demo.data.repository.Repository;
import com.example.demo.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* Uses repository created before
* */
@Service
public class DefaultMoviesService implements MoviesService {

    private final Repository<Movies, Long> moviesRepository;
    @Autowired
    public DefaultMoviesService(Repository<Movies, Long> moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    public Movies createMovie(Movies movies) {
        return moviesRepository.save(movies);
    }

    @Override
    public Movies retrieveByMoviesId(Long id) {
        return moviesRepository.getById(id);
    }

    @Override
    public List<Movies> retrieveAllMovies() {
        return moviesRepository.getAll();
    }

    @Override
    public Movies update(Movies movies) {
        return moviesRepository.update(movies);
    }

    @Override
    public void deleteMoviesById(Long id) {
        moviesRepository.deleteById(id);
    }
}
