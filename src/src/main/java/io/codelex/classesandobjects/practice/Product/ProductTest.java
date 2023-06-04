package io.codelex.classesandobjects.practice.Product;

public class ProductTest {
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
