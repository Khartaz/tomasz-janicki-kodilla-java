package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseIngredient(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), theCost);
    }

    @Test
    public void testBasicPizzaWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseIngredient(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese sauce and extra cheese", description);
    }

    @Test
    public void  testBasicPizzaWithChickenMushroomsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenIngredient(theOrder);
        theOrder = new MushroomsIngredient(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(22), theCost);
    }

    @Test
    public void testBasicPizzaWithChickenMushroomsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenIngredient(theOrder);
        theOrder = new MushroomsIngredient(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese sauce and chicken mushrooms", description);
    }

    @Test
    public void testBasicPizzaWithChickenMushroomsPepperoniGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenIngredient(theOrder);
        theOrder = new MushroomsIngredient(theOrder);
        theOrder = new PepperoniIngredient(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void testBasicPizzaWithChickenMushroomsPepperoniGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenIngredient(theOrder);
        theOrder = new MushroomsIngredient(theOrder);
        theOrder = new PepperoniIngredient(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese sauce and chicken mushrooms pepperoni", description);
    }
}
