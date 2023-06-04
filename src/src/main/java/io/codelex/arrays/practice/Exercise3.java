package io.codelex.arrays.practice;

public class Exercise3 {

    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of the array elements is: " + sum);

        double average = (double) sum / numbers.length;
        System.out.println("Average value of the array elements is : " + String.format("%.2f", average));

    }
}
