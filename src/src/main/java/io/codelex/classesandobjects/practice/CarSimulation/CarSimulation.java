package io.codelex.classesandobjects.practice.CarSimulation;

import java.util.Scanner;

public class CarSimulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fuel;
        int mileage;

        System.out.print("Enter current fuel: ");
        fuel = scan.nextInt();

        System.out.print("Enter current mileage: ");
        mileage = scan.nextInt();

        FuelGauge fuelGauge = new FuelGauge(fuel);

        if (fuel > 70) {
            System.out.println("The car can hold a maximum of 70 liters.");
        } else {
            System.out.println("Filling up the car with fuel...");
            for (int i = fuel; i < 70; i++) {
                fuelGauge.incrementFuel();
                System.out.println("Adding fuel... Current fuel: " + fuelGauge.getFuel() + " liters");
            }
        }

        if (fuel <= 0) {
            System.out.println("The car is out of fuel.");
        } else {
            Odometer odometer = new Odometer(mileage, fuelGauge);
            System.out.println("Starting the car and driving...");
            while (fuelGauge.getFuel() > 0) {
                odometer.incrementMileage();
                System.out.println("Mileage: " + odometer.getMileage() + ", Fuel: " + fuelGauge.getFuel());
            }
            System.out.println("The car is out of fuel.");
        }
    }
}