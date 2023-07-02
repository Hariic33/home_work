package io.codelex.oop.summary.generics.ordersAndInvoices;

public class ItemPacking implements Service {
    private static final String name = "Item packing";
    private static final double price = 5.00;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String fullInfo() {
        return getName() + ", " + String.format("%.2f", getPrice()) + " EUR";
    }
}