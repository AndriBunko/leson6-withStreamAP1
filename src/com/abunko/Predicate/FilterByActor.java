package com.abunko.Predicate;

import com.abunko.Actor;
import com.abunko.Film;
import com.abunko.Genre;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Andrew on 14.08.2017.
 */
public class FilterByActor implements Predicate<Film> {
    private final List<Actor> actorList;

    public static Predicate<Film> byActor(Actor... actors) {
        return new FilterByActor(actors);
    }

    private FilterByActor(Actor... actors) {
        this.actorList = Arrays.asList(actors);
    }

    @Override
    public boolean test(Film film) {
        return film.getActors().containsAll(actorList);
    }
}
