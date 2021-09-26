package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    AfishaManager afisha = new AfishaManager();
    AfishaManager constructor = new AfishaManager(7);
    private Film filmToAdd = new Film(11, "Dune", "fantastic");

    Film first = new Film(1, "Bloodshot", "thriller");
    Film second = new Film(2, "Onward", "cartoon");
    Film third = new Film(3, "Hotel Belgrad", "comedy");
    Film fourth = new Film(4, "The Gentlemen", "thriller");
    Film fifth = new Film(5, "The Invisible Man", "horror");
    Film sixth = new Film(6, "Trolls", "cartoon");
    Film seventh = new Film(7, "Number One", "comedy");
    Film eighth = new Film(8, "Free Guy", "fantastic");
    Film ninth = new Film(9, "After We Fell", "drama");
    Film tenth = new Film(10, "Soul", "cartoon");

    @BeforeEach
    public void setUp() {
        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
    }

    @BeforeEach
    public void setUpForConstructor() {
        constructor.add(first);
        constructor.add(second);
        constructor.add(third);
        constructor.add(fourth);
        constructor.add(fifth);
        constructor.add(sixth);
        constructor.add(seventh);
        constructor.add(eighth);
        constructor.add(ninth);
        constructor.add(tenth);
    }

    @Test
    void shouldAddFilm() {
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);
        afisha.add(filmToAdd);
        Film[] expected;
        expected = new Film[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, filmToAdd};
        Film[] actual = afisha.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowFilms() {
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);
        Film[] expected = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] actual = afisha.getLastAdded();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowFilmsWithConsrtructor() {
        Film[] expected = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth};
        Film[] actual = constructor.getLastAdded();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowFilmsLessShowFilms() {
        Film[] expected = new Film[]{ sixth, fifth, fourth, third, second, first};
        Film[] actual = afisha.getLastAdded();
        assertArrayEquals(expected, actual);
    }

}