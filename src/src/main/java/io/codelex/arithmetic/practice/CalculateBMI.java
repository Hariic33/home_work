package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input weight: ");
        double weight = input.nextInt() * 2.20462;

        System.out.print("Input height: ");
        double height = input.nextInt() * 0.393701;

        double BMI = weight * 703 / Math.pow(height, 2);

        if (BMI > 18.5 && BMI < 25) {

            System.out.println("The person's body mass index (" + String.format("%.1f", BMI) + ") is considered optimal.");
        } else if (BMI < 18.5) {
            System.out.println("The person's body mass index (" + String.format("%.1f", BMI) + ") is considered underweight.");
        } else if (BMI > 25) {
            System.out.println("The person's body mass index (" + String.format("%.1f", BMI) + ") is considered overweight.");
        }
    }
}
