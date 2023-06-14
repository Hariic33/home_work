package io.codelexTest.exercise2;

public class Basket<T> {
    private static final int MAX_CAPACITY = 10;
    private int itemCount;

    public void addToBasket(T item) {
        if (itemCount == MAX_CAPACITY) {
            throw new BasketFullException("Basket is already full");
        }
        itemCount++;
    }

    public void removeFromBasket() {
        if (itemCount == 0) {
            throw new BasketEmptyException("Basket is already empty");
        }
        itemCount--;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    static class BasketFullException extends RuntimeException {
        public BasketFullException(String message) {
            super(message);
        }
    }

    static class BasketEmptyException extends RuntimeException {
        public BasketEmptyException(String message) {
            super(message);
        }
    }
}