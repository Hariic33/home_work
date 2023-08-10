package io.codelex.oop.summary.generics.ordersAndInvoices;

public class ElectronicsItem extends AbstractItem {
    private final int powerInWatts;

    public ElectronicsItem(String name, double price, int powerInWatts) {
        super(name, price);
        this.powerInWatts = powerInWatts;
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
        return super.fullInfo() + ", power: " + powerInWatts + "W";
    }
}