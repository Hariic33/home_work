package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random num = new Random();
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = num.nextInt(100) + 1;
        }

        int[] myArray2 = Arrays.copyOf(myArray, myArray.length);
        myArray[myArray.length - 1] = -7;

        System.out.println("Array 1:" + Arrays.toString(myArray));
        System.out.println("Array 2:" + Arrays.toString(myArray2));
    }
}
