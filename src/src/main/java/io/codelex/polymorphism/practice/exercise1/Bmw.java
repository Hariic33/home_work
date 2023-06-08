package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car, Boost {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed -= 12;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 30;
        System.out.println("Nitrous Oxide Engine activated!");
    }

    @Override
    public String toString() {
        return "BMW";
    }

}