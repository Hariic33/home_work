package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age;
        double height, weight;

        name = "Zed A. Shaw";
        age = 35;
        height = 74 * 2.54;  // centimeters
        weight = 180 * 0.453592; // kilos
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " centimeters tall.");
        System.out.println("He's " + String.format("%.2f", weight) + " kilos heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + String.format("%.2f", weight)
                + ", " + "I get " + String.format("%.2f", (age + height + weight)) + ".");
    }
}