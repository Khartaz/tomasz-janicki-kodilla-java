package com.kodilla.stream.world;

import java.util.List;
import java.util.Objects;

public class Continent {
    private final List<Country> countries;

    public Continent(final List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countries=" + countries +
                '}';
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(countries, continent.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countries);
    }
}
