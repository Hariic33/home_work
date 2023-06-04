package io.codelex.classesandobjects.practice.Car;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);

        System.out.println("Car fuel consumption: " + car.calculateConsumption());
        if (car.gasHog()) {
            System.out.println("Car is a gas hog.");
        }
        if (car.economyCar()) {
            System.out.println("Car is an economy car.");
        }
        car.fillUp((int) endKilometers, liters);
        System.out.println("Car fill up: " + car.calculateConsumption());
    }
}
