package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int n = input.nextInt();

        if (n < 0) {
            n *= -1;
        }

        if (n <= 100) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FizzBuzz ");
                } else if (i % 3 == 0) {
                    System.out.print("Fizz ");
                } else if (i % 5 == 0) {
                    System.out.print("Buzz ");
                } else {
                    System.out.print(i + " ");
                }
                if (i % 20 == 0) {
                    System.out.println();
                }
            }
        } else {
            System.out.println("The number is bigger than 100");
        }
    }
}