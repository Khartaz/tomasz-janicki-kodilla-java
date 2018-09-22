package com.kodilla.testing.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country italy = new Country("Italy", new BigDecimal("875738"));
        Country poland = new Country("Poland", new BigDecimal("85934783"));
        Country germany = new Country("Germany", new BigDecimal("849893"));
        Country finland = new Country("Finland", new BigDecimal("9853849"));
        Country sweden = new Country("Sweden", new BigDecimal("98593894"));
        Continent europe = new Continent("Europe", Arrays.asList(italy, poland, germany, finland, sweden));

        Country fiji = new Country("Fiji", new BigDecimal("844330"));
        Country kiribati = new Country("Kiribati", new BigDecimal("713123"));
        Country micronesia = new Country("Micronesia", new BigDecimal("859853"));
        Country nauru = new Country("Nauru", new BigDecimal("4123123"));
        Country palau = new Country("Palau", new BigDecimal("782783"));
        Continent austrialia = new Continent("Australia", Arrays.asList(fiji, kiribati, micronesia, nauru, palau));

        Country algeria = new Country("Algeria", new BigDecimal("847234"));
        Country cameroon = new Country("Cameroon", new BigDecimal("4234234"));
        Country mali = new Country("Mali", new BigDecimal("4892384"));
        Country ugada = new Country("Ugada", new BigDecimal("4882"));
        Continent africa = new Continent("Africa", Arrays.asList(algeria, cameroon, mali, ugada));

        World world = new World(Arrays.asList(europe, austrialia, africa));

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("213410103");
        Assert.assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
/*
for(World w:world) {
        peopleQuantity = peopleQuantity.add(w.getPeopleQuantity());
        }
  */