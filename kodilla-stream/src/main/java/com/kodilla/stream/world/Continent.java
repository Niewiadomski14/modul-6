package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> Continents = new ArrayList<>();

    public void addCountry(Country country) {
        Continents.add(country);
    }

    public List<Country> getContinents() {
        return Continents;
    }
}
