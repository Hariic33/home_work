package io.codelex.classesandobjects.practice.Product;

public class Product {
    private final String name;
    private double priceAtStart;
    private int amountAtStart;


    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + String.format("%.2f", priceAtStart) + " EUR, amount " + amountAtStart);
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

}
