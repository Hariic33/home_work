package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isHappy = isHappyNumber(number);

        System.out.println(number + (isHappy ? " is a happy number!" : " is not a happy number."));
    }

    public static boolean isHappyNumber(int number) {
        Set<Integer> visitedNumbers = new HashSet<>();

        while (number != 1 && visitedNumbers.add(number)) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            number = sum;
        }

        return number == 1;
    }
}