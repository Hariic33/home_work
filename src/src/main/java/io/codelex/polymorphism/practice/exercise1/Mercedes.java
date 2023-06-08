package io.codelex.polymorphism.practice.exercise1;

public class Mercedes implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 14;
    }

    public void slowDown() {
        currentSpeed -= 14;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public String toString() {
        return "Mercedes";
    }

}