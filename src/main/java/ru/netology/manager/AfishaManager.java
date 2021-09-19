package ru.netology.manager;

import ru.netology.domain.Film;

public class AfishaManager {
    private Film[] films = new Film[0];
    private int showFilms = 10;
    private int resultLength = films.length;

    public static void film(String[] args) {
        Film first = new Film(1, "Bloodshot", "thriller");
        Film second = new Film(2, "Onward", "cartoon");
        Film third = new Film(3, "Hotel Belgrad", "comedy");
        Film fourth = new Film(4, "The Gentlemen", "thriller");
        Film fifth = new Film(5, "The Invisible Man", "horror");
        Film sixth= new Film(6, "Trolls", "cartoon");
        Film seventh= new Film(7, "Number One", "comedy");
        Film eighth = new Film(8, "Free Guy", "fantastic");
        Film ninth = new Film(9, "After We Fell", "drama");
        Film tenth = new Film(10, "Soul", "cartoon");
    }

    public AfishaManager() {
    }

    public AfishaManager(int resultLength) {
        this.resultLength = resultLength;
    }


    public void add (Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] findAll() { return films; }


    public Film[] getLastAdded() {
        if (resultLength >= showFilms) {
            resultLength = showFilms;
        } else {
            resultLength = resultLength;
        }
        Film[] films = findAll();
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = resultLength - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}