package io.codelex.typesandvariables.practice;
import java.util.Scanner;

public class SumOfSingleDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i += 1){
            System.out.print("Enter a single digit: ");
            int digit = input.nextInt();
            if (digit >= 0 && digit <= 9) {
                sum += digit;
            } else {
                System.out.println("Too many digits bro. Please enter a single digit.");
                i -= 1;
            }
        }
        System.out.println("The total sum is: " + sum);
    }
}