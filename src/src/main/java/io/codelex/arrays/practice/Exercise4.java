package io.codelex.arrays.practice;

public class Exercise4 {

    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };
        boolean contains1245 = false;
        boolean contains1456 = false;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1245) {
                contains1245 = true;
            }
            if (myArray[i] == 1456) {
                contains1456 = true;
            }
        }

        if (contains1245) {
            System.out.println("Array contains number 1245.");
        } else {
            System.out.println("Array does not contain number 1245.");
        }

        if (contains1456) {
            System.out.println("Array contains number 1456.");
        } else {
            System.out.println("Array does not contain number 1456.");
        }
    }
}