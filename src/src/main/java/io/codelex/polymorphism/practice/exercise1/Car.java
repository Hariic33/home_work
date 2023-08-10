package io.codelex.polymorphism.practice.exercise1;

interface Car {
    default void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    void speedUp();

    void slowDown();

    String showCurrentSpeed();

}