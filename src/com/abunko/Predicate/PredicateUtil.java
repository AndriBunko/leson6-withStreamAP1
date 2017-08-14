package com.abunko.Predicate;

import com.abunko.Actor;
import com.abunko.Film;
import com.abunko.Genre;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Created by Adrew on 14.08.2017.
 */
public final class PredicateUtil {
    private PredicateUtil() {
    }

    public static Predicate<Film> byGenre(Genre... genres){
        return  film -> film.getGenres().containsAll(Arrays.asList(genres));
    }

    public static Predicate<Film> byActor(Actor... actors){
        return film -> film.getActors().containsAll(Arrays.asList(actors));
    }

    public static Predicate<Film> byYear(int star, int end){
        return film -> film.getYearRelease() > star && film.getYearRelease() < end;
    }
}
