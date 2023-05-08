package io.codelex.arithmetic.practice;
import java.util.Scanner;
public class CheckIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input 1st number: ");
        int num1 = input.nextInt();

        System.out.print("Input 2nd number: ");
        int num2 = input.nextInt();

        boolean isItFifteen = (num1 == 15 || num2 == 15 || num1 + num2 == 15 || Math.abs(num1 - num2) == 15);

        if (isItFifteen) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}