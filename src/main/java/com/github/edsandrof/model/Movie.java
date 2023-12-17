package com.github.edsandrof.model;

import com.github.edsandrof.model.enums.Genre;
import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity(name = "movie")
public class Movie extends PanacheEntity {

    public String originalTitle;
    public LocalDate releaseDate;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    public List<Genre> genres;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "filmography", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    public List<Actor> cast;

    public String synopsis;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "director_id")
    public Director director;

    public String poster;

    public void addActor(Actor actor) {
        this.cast.add(actor);
    }
}
