package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    AfishaManager afisha = new AfishaManager();
    AfishaManager afisha1 = new AfishaManager(7);
    private Film filmToAdd = new Film(11, "Dune", "fantastic");

    @Test
    void shouldAddFilm() {
        afisha.add(filmToAdd);
        Film[] expected;
        expected = new Film[]{
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
                new Film(11, "Dune", "fantastic"),
        };
    }

    @Test
    void shouldShowFilms() {
        afisha1.getLastAdded();
        Film[] expected = new Film[]{
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
//                new Film(11, "Dune", "fantastic"),
        };
        Film[] actual = afisha.getLastAdded();
        assertArrayEquals(expected, actual);
    }
}