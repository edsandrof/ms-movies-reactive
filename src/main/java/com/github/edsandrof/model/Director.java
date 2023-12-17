package com.github.edsandrof.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "director")
public class Director extends Person {

    @JsonIgnore
    @OneToMany(mappedBy = "director")
    public List<Movie> directedMovies = new ArrayList<>();

    public Director() {
        super();
    }

    public Director(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    public Director(String name, LocalDate birthDate, List<Movie> directedMovies) {
        this(name, birthDate);
        this.directedMovies = directedMovies;
    }


    public void workedOn(Movie movie) {
        this.directedMovies.add(movie);
    }
}
