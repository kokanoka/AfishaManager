package ru.netology.manager;

import ru.netology.domain.Film;

public class AfishaManager {
    private Film[] films = new Film[]{
            new Film(1, "Bloodshot", "thriller"),
            new Film(2, "Onward", "cartoon"),
            new Film(3, "Hotel Belgrad", "comedy"),
            new Film(4, "The Gentlemen", "thriller"),
            new Film(5, "The Invisible Man", "horror"),
            new Film(6, "Trolls", "cartoon"),
            new Film(7, "Number One", "comedy"),
            new Film(8, "Free Guy", "fantastic"),
            new Film(9, "After We Fell", "drama"),
            new Film(10, "Soul", "cartoon"),
    };
    private int showFilms = 10;
    private int resultLength = films.length;

    public AfishaManager() {

    }

    public AfishaManager(int resultLength) {

        this.resultLength = resultLength;
    }


    public void add(Film film) {
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