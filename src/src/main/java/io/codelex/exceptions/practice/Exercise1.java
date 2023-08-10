package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator: ");
            String numeratorInput = scanner.next();

            if (numeratorInput.equalsIgnoreCase("q")) {
                break;
            }

            int numerator;
            try {
                numerator = Integer.parseInt(numeratorInput);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.\n");
                continue;
            }

            System.out.println("Enter the divisor:");
            int divisor = scanner.nextInt();

            if (divisor == 0) {
                System.out.println("You can't divide " + numerator + " by " + divisor + "\n");
                continue;
            }

            System.out.println(numerator + " / " + divisor + " is " + numerator / divisor + "\n");
        }
    }
}