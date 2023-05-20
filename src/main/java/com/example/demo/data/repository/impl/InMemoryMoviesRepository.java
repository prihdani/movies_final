package com.example.demo.data.repository.impl;

import com.example.demo.data.model.Movies;
import com.example.demo.data.repository.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class InMemoryMoviesRepository implements Repository<Movies, Long> {

    private static final Map<Long, Movies> STORAGE = new HashMap<>();
    @Override
    public Movies save(Movies movies) {
        Long id = STORAGE.size()+1L;
        movies.setId(id);
        STORAGE.put(id,movies);
        return STORAGE.get(id);
    }

    @Override
    public Movies getById(Long id) {
        return STORAGE.get(id);
    }

    @Override
    public List<Movies> getAll() {
        return STORAGE.values().stream().toList();
    }

    @Override
    public Movies update(Movies movies) {
        Long id = movies.getId();
        STORAGE.put(id,movies);
        return STORAGE.get(id);
    }

    @Override
    public void deleteById(Long id) {
        STORAGE.remove(id);
    }
}
