package io.codelex.classesandobjects.practice;

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

    public static void main(String[] args) {
        Product firstProduct = new Product("Logitech mouse", 70.00, 14);
        firstProduct.printProduct();

        Product secondProduct = new Product("iPhone 5s", 999.99, 3);
        secondProduct.printProduct();

        Product thirdProduct = new Product("Epson EB-U05", 440.46, 1);
        thirdProduct.printProduct();

        thirdProduct.setAmountAtStart(99);
        thirdProduct.setPriceAtStart(399.39);
        thirdProduct.printProduct();
    }
}
