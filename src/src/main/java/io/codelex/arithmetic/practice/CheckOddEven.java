package io.codelex.arithmetic.practice;
import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int num = input.nextInt();

        if (num % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }

        System.out.println("bye!");
    }
}