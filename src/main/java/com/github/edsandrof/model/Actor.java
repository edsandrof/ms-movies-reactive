package com.github.edsandrof.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "actor")
public class Actor extends Person {

    public String artisticName;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "actor_movie",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    public List<Movie> filmography = new ArrayList<>();

    public Actor() {
        super();
    }

    public Actor(String name, LocalDate birthDate, String artisticName) {
        super(name, birthDate);
        this.artisticName = artisticName;
    }

    public void workedOn(Movie movie) {
        this.filmography.add(movie);
    }
}
