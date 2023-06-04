package io.codelex.classesandobjects.practice.Car;

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

