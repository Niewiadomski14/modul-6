package com.kodilla.stream.world;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //GIVEN
        Country Poland = new Country(new BigDecimal("38536869"));
        Country Germany = new Country(new BigDecimal("82422299"));
        Country Vietnam = new Country(new BigDecimal("84402966"));
        Country Mongolia = new Country(new BigDecimal("2832224"));
        Country USA = new Country(new BigDecimal("298444215"));
        Country Canada = new Country(new BigDecimal("33098932"));
        Country Venezuela = new Country(new BigDecimal("25730435"));
        Country Egypt = new Country(new BigDecimal("78887007"));
        Country Morocco = new Country(new BigDecimal("33241259"));
        Country Austria = new Country(new BigDecimal("8192880"));
        Country Australia = new Country(new BigDecimal("20264082"));

        //Continents
        Continent europe = new Continent();
        europe.addCountry(Poland);
        europe.addCountry(Germany);
        europe.addCountry(Austria);

        Continent asia = new Continent();
        asia.addCountry(Vietnam);
        asia.addCountry(Mongolia);

        Continent northAmerica = new Continent();
        northAmerica.addCountry(USA);
        northAmerica.addCountry(Canada);

        Continent southAmerica = new Continent();
        southAmerica.addCountry(Venezuela);

        Continent africa = new Continent();
        africa.addCountry(Egypt);
        africa.addCountry(Morocco);

        Continent australia = new Continent();
        australia.addCountry(Australia);

        //Continent list
        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(australia);
        world.addContinent(southAmerica);
        world.addContinent(northAmerica);

        //WHEN
        BigDecimal totalPeople = (BigDecimal) world.getContinentList().stream()
                .flatMap(continent -> continent.getContinents().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum.add(current));

        //Then
        BigDecimal peopleOnTheWorld = new BigDecimal("706053168");
        Assert.assertEquals(peopleOnTheWorld,totalPeople);
    }
}