package com.abunko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrew on 20.07.2017.
 */
public class Film {
    private String name;
    private int yearRelease;
    private List<Genre> genres = new ArrayList<>();
    private List<Actor> actors = new ArrayList<>();

    public Film(String name, int yearRelease) {
        this.name = name;
        this.yearRelease = yearRelease;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public  void setGenres(Genre ... genres) {
        this.genres = Arrays.asList(genres);
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(Actor... actors) {
        this.actors = Arrays.asList(actors);
    }

    @Override
    public String toString() {
        return "Film name = " + name ;
    }
}
