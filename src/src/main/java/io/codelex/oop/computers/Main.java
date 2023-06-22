package io.codelex.oop.computers;

public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Computer("AMD Ryzen 7 5800X", "32GB",
                "AMD Radeon RX 6900 XT", "AMD", "Model XYZ");

        Computer pc2 = new Computer("Intel Core i9-11900K", "32GB",
                "NVIDIA GeForce RTX 3080", "ASUS", "ROG Strix G15CE");

        Laptop pc3 = new Laptop("Intel Core i7-10700K", "16GB",
                "NVIDIA GeForce RTX 3070", "Lenovo", "Legion", "60Wh");

        System.out.println("Processor of first PC: " + pc1.getProcessor());
        System.out.println("RAM of second PC: " + pc2.getRam());

        pc1.setProcessor("AMD Ryzen 9 5900X");
        pc2.setRam("64GB");

        System.out.println("Updated processor of first PC: " + pc1.getProcessor());
        System.out.println("Updated RAM of second PC: " + pc2.getRam());

        System.out.println("Details of first PC: " + pc1);
        System.out.println("Details of second PC: " + pc2);
        System.out.println("Details of third PC: " + pc3);

        System.out.println("Are pc1 and pc2 equal? " + pc1.equals(pc2));

        System.out.println("Hash code of first PC: " + pc1.hashCode());
        System.out.println("Hash code of second PC: " + pc2.hashCode());
        System.out.println("Hash code of third PC: " + pc3.hashCode());

        pc3.setBattery("80Wh");
        System.out.println("Battery capacity of third PC: " + pc3.getBattery());
    }
}