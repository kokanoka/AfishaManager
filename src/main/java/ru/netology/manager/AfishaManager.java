package ru.netology.manager;

import ru.netology.domain.Film;

public class AfishaManager {
   private Film[] films = new Film[0];
    int showFilms = 10;
    int resultLength;

    public AfishaManager() {
    }

    public AfishaManager(int showFilms) {
                this.showFilms = showFilms;
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
        if (films.length >= showFilms) {
            resultLength = showFilms;
        } else {
            resultLength = films.length;
        }
        Film[] films = findAll();
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}