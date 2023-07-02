package io.codelex.oop.summary.generics.ordersAndInvoices;

public class Invoice {
    private final Order order;
    private final String invoiceNumber;
    private InvoiceStatus status;

    public Invoice(Order order, String invoiceNumber) {
        this.order = order;
        this.invoiceNumber = invoiceNumber;
        this.status = InvoiceStatus.APPROVED;
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    private double calculateSum() {
        double sum = 0;
        for (SellableThings item : order.getItems()) {
            sum += item.getPrice();
        }
        return sum;
    }

    private double calculateVAT() {
        return calculateSum() * 0.21;
    }

    private double calculateTotal() {
        return calculateSum() + calculateVAT();
    }

    public String getFormattedInvoice() {
        return "=".repeat(50) + "\n" +
                String.format("= INVOICE NUMBER: %s%25s=\n", invoiceNumber, "") +
                String.format("= STATUS: %s%31s=\n", status, "") +
                order.getItemsText() +
                String.format("= SUM: %.2f EUR%33s=\n", calculateSum(), "") +
                String.format("= VAT (21%%): %.2f EUR%28s=\n", calculateVAT(), "") +
                String.format("= TOTAL: %.2f EUR%31s=\n", calculateTotal(), "") +
                "=".repeat(50) + "\n";
    }

    @Override
    public String toString() {
        return getFormattedInvoice();
    }
}