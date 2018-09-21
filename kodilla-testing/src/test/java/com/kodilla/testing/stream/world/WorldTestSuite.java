package com.kodilla.testing.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuiteTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent continent = new Continent()
        List<World> continents = new ArrayList<>();
        List<Continent> countres = new ArrayList<>();

        //When
        BigDecimal peopleQuantity = BigDecimal.ZERO;
        for(World world1:continents) {
            peopleQuantity = peopleQuantity.add(world1.getPeopleQuantity());
        }
        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("982458528710");
        Assert.assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
