package io.codelexTest.javaAdvancedTest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private static final int MAX_CAPACITY = 10;
    private List<T> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addToBasket(T item) {
        if (items.size() == MAX_CAPACITY) {
            throw new BasketFullException("Basket is already full");
        }
        items.add(item);
    }

    public void removeFromBasket() {
        if (items.isEmpty()) {
            throw new BasketEmptyException("Basket is already empty");
        }
        items.remove(items.size() - 1);
    }

    public int getItemCount() {
        return items.size();
    }
}