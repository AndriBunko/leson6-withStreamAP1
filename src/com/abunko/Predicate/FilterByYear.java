package com.abunko.Predicate;

import com.abunko.Film;

import java.util.function.Predicate;

/**
 * Created by Andrew on 09.08.2017.
 */
public class FilterByYear implements Predicate<Film>{
    private final int star;
    private final int end;

    public static FilterByYear byYear(int star, int end){
        return  new FilterByYear(star, end);
    }

    private FilterByYear(int star, int end) {
        this.star = star;
        this.end = end;
    }

    @Override
    public boolean test(Film film) {
        return film.getYearRelease() > star && film.getYearRelease() < end;
    }
}
