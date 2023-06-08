package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> Zs Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + 1);
        } else {
            System.out.println("> " + getAnimalType() + "s are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return "Zebra" + super.toString();
    }
}
