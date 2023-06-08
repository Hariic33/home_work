package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        while (true) {
            String animalInput = scanner.nextLine();
            if (animalInput.equals("End")) {
                break;
            }

            String[] animalInfo = animalInput.split(" ");
            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            double animalWeight = Double.parseDouble(animalInfo[2]);
            String animalLivingRegion = animalInfo[3];
            Animal animal;

            switch (animalType) {
                case "Cat" -> {
                    String catBreed = animalInfo[4];
                    animal = new Cat(animalName, animalType, animalWeight, 0, animalLivingRegion, catBreed);
                }
                case "Tiger" -> animal = new Tiger(animalName, animalType, animalWeight, 0, animalLivingRegion);
                case "Zebra" -> animal = new Zebra(animalName, animalType, animalWeight, 0, animalLivingRegion);
                case "Mouse" -> animal = new Mouse(animalName, animalType, animalWeight, 0, animalLivingRegion);
                default -> {
                    continue;
                }
            }

            animal.makeSound();

            String foodInput = scanner.nextLine();
            String[] foodInfo = foodInput.split(" ");
            String foodType = foodInfo[0];
            int quantity = Integer.parseInt(foodInfo[1]);
            Food food;

            if (foodType.equals("Vegetable")) {
                food = new Vegetable(quantity);
            } else if (foodType.equals("Meat")) {
                food = new Meat(quantity);
            } else {
                continue;
            }

            animal.eat(food);
            animals.add(animal);
        }

        for (Animal animal : animals) {
            System.out.println("> " + animal);
        }
    }
}