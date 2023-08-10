package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input number: ");
            double d = getInput(scanner.nextLine());
            if (d <= 0) {
                throw new NonPositiveNumberException("Result will be imaginary number.");
            }
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be imaginary number.");
        }
    }

    static double getInput(String s) {
        return Double.parseDouble(s);
    }

    static class NonPositiveNumberException extends Exception {
        public NonPositiveNumberException(String message) {
            super(message);
        }
    }
}