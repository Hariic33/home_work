package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> Squeak");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("> " + getAnimalType() + " are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return "Mouse" + super.toString();
    }
}
