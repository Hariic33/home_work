package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Min? ");
        int min = input.nextInt();
        System.out.print("Max? ");
        int max = input.nextInt();

        if (min > max) {
            System.out.println("Min integer cannot be bigger than max.");
        } else {
            for (int row = min; row <= max; row++) {
                for (int column = row; column <= max; column++) {
                    System.out.print(column);
                }
                for (int col = min; col < row; col++) {
                    System.out.print(col);
                }
                System.out.println();
            }
        }
    }
}
