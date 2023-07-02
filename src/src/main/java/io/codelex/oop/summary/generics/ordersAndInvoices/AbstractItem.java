package io.codelex.oop.summary.generics.ordersAndInvoices;

public abstract class AbstractItem implements Item {
    private final String name;
    private final double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String fullInfo() {
        return getName() + ", " + String.format("%.2f", getPrice()) + " EUR";
    }
}