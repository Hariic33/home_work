package io.codelex.classesandobjects.practice.CarSimulation;

public class FuelGauge {
    private int fuel;

    public FuelGauge(int fuel) {
        this.fuel = Math.min(fuel, 70);
    }

    public int getFuel() {
        return fuel;
    }

    public void incrementFuel() {
        if (fuel < 70) {
            fuel++;
        }
    }

    public void decrementFuel() {
        if (fuel > 0) {
            fuel--;
        }
    }
}

