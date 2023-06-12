package io.codelex.oop.summary.generics.ordersAndInvoices;

public class HouseholdItem extends AbstractItem {
    private final String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + ", color: " + color;
    }
}