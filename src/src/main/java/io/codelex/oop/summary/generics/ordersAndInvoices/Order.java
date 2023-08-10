package io.codelex.oop.summary.generics.ordersAndInvoices;

import java.util.ArrayList;
import java.util.List;

class Order {
    private final List<SellableThings> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(SellableThings item) {
        items.add(item);
    }

    public List<SellableThings> getItems() {
        return items;
    }

    public String getItemsText() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            SellableThings item = items.get(i);
            sb.append(String.format("= %d. %s%-" + (44 - item.fullInfo().length()) + "s=\n", i + 1, item.fullInfo(), ""));
        }
        return sb.toString();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean contains(Class<?> itemClass) {
        for (SellableThings item : items) {
            if (itemClass.isInstance(item)) {
                return true;
            }
        }
        return false;
    }
}