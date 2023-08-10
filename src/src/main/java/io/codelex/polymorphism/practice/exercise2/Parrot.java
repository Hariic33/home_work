package io.codelex.polymorphism.practice.exercise2;

class Parrot implements Sound {
    @Override
    public void playSound() {
        System.out.println("squawk");
        System.out.println("screech");
    }
}
