package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int[] myArray = new int[maxNumber - minNumber + 1];
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = minNumber + i;
            sum += myArray[i];
        }

        System.out.println("The sum is " + sum);

        System.out.println("The contents of myArray are:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
