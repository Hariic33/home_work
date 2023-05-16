package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo, double endOdo, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = endOdo;
        this.liters = liters;
    }

    public double calculateConsumption() {
        return 100 * (liters / (endKilometers - startKilometers));
    }

    public boolean gasHog() {
        double consumption = calculateConsumption();
        return consumption > 15.0;
    }

    public boolean economyCar() {
        double consumption = calculateConsumption();
        return consumption < 5.0;
    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters += liters;
    }
}

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

