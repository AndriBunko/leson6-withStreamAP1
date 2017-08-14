package com.abunko;

import com.abunko.Predicate.FilterByActor;
import com.abunko.Predicate.FilterByGenre;
import com.abunko.Predicate.FilterByYear;
import com.abunko.Predicate.PredicateUtil;

import static com.abunko.Genre.*;

/**
 * Created by Andrew on 20.07.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Actor petya = new Actor("Petya", "Petya");
        Actor pasha = new  Actor("Pasha", "Pasha");
        Actor vasya = new  Actor("Vasya", "Vasya");
        Actor sasha = new Actor("Sasha", "Sasha");

        Film film = new Film("film", 2004);
        film.setActors(petya, pasha);
        film.setGenres(ACTHION, THRILLER);

        Film film1 = new Film("film1", 2016);
        film1.setActors(petya, vasya);
        film1.setGenres(SPORTS, THRILLER);

        Film film2 = new Film("film2", 2000);
        film2.setActors(sasha, pasha);
        film2.setGenres(ACTHION, FAMILY);

        Films films = new Films();

        films.addFilm(film);
        films.addFilm(film1);
        films.addFilm(film2);

        System.out.println(films.filterFilms(FilterByYear.byYear(1992, 2001)));
        System.out.println(films.filterFilms(PredicateUtil.byYear(1992, 2001)));

        System.out.println(films.filterFilms(FilterByActor.byActor(petya, vasya)));
        System.out.println(films.filterFilms(PredicateUtil.byActor(pasha, vasya)));

        System.out.println(films.filterFilms(FilterByGenre.byGenres(ACTHION, THRILLER)));
        System.out.println(films.filterFilms(PredicateUtil.byGenre(ACTHION, THRILLER)));

    }
}
