package io.codelex.oop.summary.generics.ordersAndInvoices;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {
        Item milk = new FoodItem("Milk", 0.75, LocalDate.of(2022, 4, 1));
        Item radio = new ElectronicsItem("Radio", 25, 100);
        Item bucket = new HouseholdItem("Bucket", 5, "red");
        ItemPacking packing = new ItemPacking();

        Order order = new Order();
        order.addItem(milk);
        order.addItem(radio);
        order.addItem(bucket);
        order.addItem(packing);

        Invoice invoice = new Invoice(order, "INV123");

        if (order.isEmpty()) {
            System.err.println("WrongOrderException");
        } else if (order.getItems()
                .stream()
                .anyMatch(item -> item instanceof FoodItem && ((FoodItem) item)
                        .getDateOfExpiration()
                        .isBefore(LocalDate.of(2022, 4, 1)))) {
            System.err.println("BadFoodException");
        } else {
            System.out.println(invoice);
        }
    }
}