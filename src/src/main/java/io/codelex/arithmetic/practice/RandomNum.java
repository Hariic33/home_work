package io.codelex.arithmetic.practice;
import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main (String[] args) {
        Random num = new Random();
        int number = num.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        int guess;

        System.out.print("I'm thinking of a number between 1-100. Try to guess it: ");

        while (true) {
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("You guessed it! What are the odds?!?");
                break;
            } else if (guess > number) {
                System.out.println("Sorry, you are too high. I was thinking of " + number + ".");
            } else {
                System.out.println("Sorry, you are too low. I was thinking of " + number + ".");
            }
        }
    }
}
