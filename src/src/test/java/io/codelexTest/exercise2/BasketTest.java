package io.codelexTest.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BasketTest {
    @Test
    public void testAddToBasket() {
        Basket<Apple> appleBasket = new Basket<>();

        for (int i = 0; i < 10; i++) {
            appleBasket.addToBasket(new Apple());
        }

        try {
            appleBasket.addToBasket(new Apple());
            fail("Expected BasketFullException to be thrown");
        } catch (Basket.BasketFullException e) {
            assertEquals("Basket is already full", e.getMessage());
        }
    }

    @Test
    public void testRemoveFromBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();

        try {
            mushroomBasket.removeFromBasket();
            fail("BasketEmptyException thrown");
        } catch (Basket.BasketEmptyException e) {
            assertEquals("Basket is already empty", e.getMessage());
        }

        for (int i = 0; i < 10; i++) {
            mushroomBasket.addToBasket(new Mushroom());
        }

        for (int i = 0; i < 10; i++) {
            mushroomBasket.removeFromBasket();
        }

        try {
            mushroomBasket.removeFromBasket();
            fail("BasketEmptyException thrown");
        } catch (Basket.BasketEmptyException e) {
            assertEquals("Basket is already empty", e.getMessage());
        }
    }
}