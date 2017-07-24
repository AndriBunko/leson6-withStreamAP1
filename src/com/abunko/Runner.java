package com.abunko;

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

        System.out.println(films.sortFilmsByActor(petya, vasya));
        System.out.println(films.sortFilmsByGare(THRILLER, ACTHION));
        System.out.println(films.sortFilmsByYear(1992, 2000));
    }
}
