package com.github.edsandrof.controller;

import com.github.edsandrof.model.Movie;
import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.List;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieController {

    @GET
    @Path("")
    public Uni<List<Movie>> listAll() {
        return Movie.listAll();
    }

    @GET
    @Path("/{id}")
    public Uni<Movie> getById(@RestPath("id") Long id) {
        return Movie.findById(id)
                .onItem().ifNotNull().transformToUni(movie -> Uni.createFrom().item((Movie) movie))
                .onItem().ifNull().failWith(() -> new NotFoundException("Movie not found with id: " + id));
    }

    @POST
    @Path("")
    public Uni<RestResponse<?>> register(Movie movie) {
        return Panache.withTransaction(movie::persist)
                .replaceWith(RestResponse.status(RestResponse.Status.CREATED, movie));
    }

    @DELETE
    @Path("/{id}")
    public Uni<Void> delete(@RestPath("id") Long id) {
        return Panache.withTransaction(() -> Movie.findById(id)
                .onItem().ifNotNull().call(PanacheEntityBase::delete))
                .replaceWithVoid();
    }

}
