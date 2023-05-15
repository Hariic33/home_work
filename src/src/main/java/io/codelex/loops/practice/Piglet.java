package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean rollAgain = true;
        int totalPoints = 0;

        while (rollAgain) {
            int diceRoll = rand.nextInt(6) + 1;
            System.out.println("You rolled a " + diceRoll + "!");

            if (diceRoll == 1) {
                System.out.println("You got 0 points.");
                rollAgain = false;
            } else {
                totalPoints += diceRoll;
                System.out.print("Roll again? (yes/no) ");
                String input = scanner.nextLine();

                if (input.toLowerCase().startsWith("n")) {
                    System.out.println("You got " + totalPoints + " points.");
                    rollAgain = false;
                }
            }
        }
    }
}