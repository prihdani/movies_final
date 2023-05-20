package com.example.demo.data.model;

import java.util.Objects;
import java.util.StringJoiner;

/*
* Model class for movies
* */
public class Movies {
    private Long id;
    private String title;
    private String director;
    private int releaseDate;
    private int ageRestriction;
    private Genre genre;

    public Movies() {
    }

    public Movies(Long id, String title, String director, int releaseDate, int ageRestriction, Genre genre) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.ageRestriction = ageRestriction;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movies movies)) return false;
        return getReleaseDate() == movies.getReleaseDate() && getAgeRestriction() == movies.getAgeRestriction() && Objects.equals(getId(), movies.getId()) && Objects.equals(getTitle(), movies.getTitle()) && Objects.equals(getDirector(), movies.getDirector()) && getGenre() == movies.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDirector(), getReleaseDate(), getAgeRestriction(), getGenre());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Movies.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("director='" + director + "'")
                .add("releaseDate=" + releaseDate)
                .add("ageRestriction=" + ageRestriction)
                .add("genre=" + genre)
                .toString();
    }
}
