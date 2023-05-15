package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if (n < 0)
            n *= -1;

        long result = 1;
        for (i = 1; i <= n; i++) {
            result *= n;
        }
        System.out.println(n + " multiplied with itself " + n + " times is: " + result);
    }
}