package com.abunko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Andrew on 20.07.2017.
 */
public class Films {
    private List<Film> films = new ArrayList<>();

    public Films() {
    }

    public Films(List<Film> films) {
        this.films = films;
    }

    public void addFilm(Film f){
        films.add(f);
    }

    public Films filterFilms(Predicate<Film> predicate){
        return new Films(films.stream().filter(predicate).collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return String.valueOf(films);
    }
}
