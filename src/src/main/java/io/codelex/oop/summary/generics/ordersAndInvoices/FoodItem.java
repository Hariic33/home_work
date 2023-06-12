package io.codelex.oop.summary.generics.ordersAndInvoices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodItem extends AbstractItem {
    private final LocalDate dateOfExpiration;

    public FoodItem(String name, double price, LocalDate dateOfExpiration) {
        super(name, price);
        this.dateOfExpiration = dateOfExpiration;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }

    @Override
    public String fullInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = dateOfExpiration.format(formatter);
        return super.fullInfo() + ", best before: " + formattedDate;
    }
}