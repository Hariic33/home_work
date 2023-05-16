package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int desiredSum = input.nextInt();

        if (desiredSum > 12 || desiredSum < 2) {
            System.out.println("Please input an integer between 2 and 12");
        } else {
            System.out.println("Desired sum: " + desiredSum);
            int total = 0;
            while (desiredSum != total) {
                int firstDiceRoll = rand.nextInt(6) + 1;
                int secondDiceRoll = rand.nextInt(6) + 1;
                total = firstDiceRoll + secondDiceRoll;
                System.out.println(firstDiceRoll + " and " + secondDiceRoll + " = " + total);
            }
        }
    }
}