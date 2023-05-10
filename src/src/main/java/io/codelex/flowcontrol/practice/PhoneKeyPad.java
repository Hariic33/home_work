package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        nestedIfStatement();
        switchCaseDefaultStatement();
    }

    private static void nestedIfStatement() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String input = in.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            if (key >= 'a' && key <= 'z') {
                if (key == 'a' || key == 'b' || key == 'c') {
                    System.out.print(2);
                } else if (key == 'd' || key == 'e' || key == 'f'){
                    System.out.print(3);
                } else if (key == 'g' || key == 'h' || key == 'i'){
                    System.out.print(4);
                } else if (key == 'j' || key == 'k' || key == 'l'){
                    System.out.print(5);
                } else if (key == 'm' || key == 'n' || key == 'o'){
                    System.out.print(6);
                } else if (key == 'p' || key == 'q' || key == 'r' || key == 's'){
                    System.out.print(7);
                } else if (key == 't' || key == 'u' || key == 'v'){
                    System.out.print(8);
                } else if (key == 'w' || key == 'x' || key == 'y' || key == 'z'){
                    System.out.print(9);
                }
            } else {
                System.out.print(key);
            }
        }
    }

    private static void switchCaseDefaultStatement() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + "Input: ");
        String input = in.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char inChar = input.charAt(i);

            switch (inChar) {
                case 'a': case 'b': case 'c':
                    System.out.print(2); break;
                case 'd': case 'e': case 'f':
                    System.out.print(3); break;
                case 'g': case 'h': case 'i':
                    System.out.print(4); break;
                case 'j': case 'k': case 'l':
                    System.out.print(5); break;
                case 'm': case 'n': case 'o':
                    System.out.print(6); break;
                case 'p': case 'q': case 'r': case 's':
                    System.out.print(7); break;
                case 't': case 'u': case 'v':
                    System.out.print(8); break;
                case 'w': case 'x': case 'y': case 'z':
                    System.out.print(9); break;
                default:
                    System.out.print(inChar); break;
            }
        }
    }
}