package com.kodilla.testing.stream.world;

import com.kodilla.stream.world.Country;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuiteTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countries = new ArrayList<>();
        countries.add(new Country(new BigDecimal("23185938492")));
        countries.add(new Country(new BigDecimal("928493894")));
        countries.add(new Country(new BigDecimal("958294892384")));
        countries.add(new Country(new BigDecimal("049203940")));
        //When
        BigDecimal peopleQuantity = BigDecimal.ZERO;
        for(Country contries:countries) {
            peopleQuantity = peopleQuantity.add(contries.getPeopleQuantity());
        }
        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("982458528710");
        Assert.assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
