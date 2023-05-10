package io.codelex.loops.practice;

import java.util.Scanner;

public class SeparateTwoWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = in.nextLine().toLowerCase();
        System.out.print("Enter second word: ");
        String word2 = in.nextLine().toLowerCase();

        int dotsNeeded = 30 - (word1.length() - word2.length());
        String dots = "";
        for (int i = 1; i < dotsNeeded; i++) {
            dots += ".";
        }
        System.out.println(word1 + dots + word2);
    }
}
