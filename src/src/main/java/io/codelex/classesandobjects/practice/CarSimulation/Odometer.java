package io.codelex.classesandobjects.practice.CarSimulation;

public class Odometer {
    private int mileage;
    private FuelGauge fuelGauge;

    public Odometer(int mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public int getMileage() {
        return mileage;
    }

    public void incrementMileage() {
        if (mileage == 999999) {
            mileage = 0;
        } else {
            mileage++;
        }

        if (mileage % 10 == 0) {
            fuelGauge.decrementFuel();
        }
    }
}
