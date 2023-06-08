package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 6;
    }

    public void slowDown() {
        currentSpeed -= 6;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Volvo";
    }

}