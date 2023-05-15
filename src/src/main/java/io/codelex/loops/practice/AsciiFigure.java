package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        sizeFive();
        anySize();
    }

    private static void sizeFive() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (4 - i) * 4; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < i * 8; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (4 - i) * 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void anySize() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1) * 4; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < i * 8; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n - i - 1) * 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
