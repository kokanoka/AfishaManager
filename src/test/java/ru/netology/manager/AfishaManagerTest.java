package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    AfishaManager afisha = new AfishaManager();
    AfishaManager constructor = new AfishaManager(7);
    private Film filmToAdd = new Film(11, "Dune", "fantastic");

    @Test
    void shouldAddFilm() {
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

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);
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
        Film[] actual = afisha.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowFilms() {

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

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);

        Film[] expected = new Film[]{
                new Film(10, "Soul", "cartoon"),
                new Film(9, "After We Fell", "drama"),
                new Film(8, "Free Guy", "fantastic"),
                new Film(7, "Number One", "comedy"),
                new Film(6, "Trolls", "cartoon"),
                new Film(5, "The Invisible Man", "horror"),
                new Film(4, "The Gentlemen", "thriller"),
                new Film(3, "Hotel Belgrad", "comedy"),
                new Film(2, "Onward", "cartoon"),
                new Film(1, "Bloodshot", "thriller"),
        };
        Film[] actual = afisha.getLastAdded();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowFilmsWithConsrtructor() {

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

        Film[] expected = new Film[]{
                new Film(10, "Soul", "cartoon"),
                new Film(9, "After We Fell", "drama"),
                new Film(8, "Free Guy", "fantastic"),
                new Film(7, "Number One", "comedy"),
                new Film(6, "Trolls", "cartoon"),
                new Film(5, "The Invisible Man", "horror"),
                new Film(4, "The Gentlemen", "thriller"),
        };
        Film[] actual = constructor.getLastAdded();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowFilmsLessShowFilms() {

        Film first = new Film(1, "Bloodshot", "thriller");
        Film second = new Film(2, "Onward", "cartoon");
        Film third = new Film(3, "Hotel Belgrad", "comedy");
        Film fourth = new Film(4, "The Gentlemen", "thriller");
        Film fifth = new Film(5, "The Invisible Man", "horror");
        Film sixth = new Film(6, "Trolls", "cartoon");

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);


        Film[] expected = new Film[]{
                new Film(6, "Trolls", "cartoon"),
                new Film(5, "The Invisible Man", "horror"),
                new Film(4, "The Gentlemen", "thriller"),
                new Film(3, "Hotel Belgrad", "comedy"),
                new Film(2, "Onward", "cartoon"),
                new Film(1, "Bloodshot", "thriller"),
        };
        Film[] actual = afisha.getLastAdded();
        assertArrayEquals(expected, actual);
    }

}