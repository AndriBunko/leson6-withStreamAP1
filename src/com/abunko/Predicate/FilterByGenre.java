package com.abunko.Predicate;

import com.abunko.Film;
import com.abunko.Genre;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Andrew on 09.08.2017.
 */
public class FilterByGenre implements Predicate<Film>{
    private final List<Genre> genreList;

    public static Predicate<Film> byGenres(Genre... genres) {
        return new FilterByGenre(genres);
    }

    private FilterByGenre(Genre... genres) {
        this.genreList = Arrays.asList(genres);
    }

    @Override
    public boolean test(Film film) {
        return film.getGenres().containsAll(genreList);
    }
}
