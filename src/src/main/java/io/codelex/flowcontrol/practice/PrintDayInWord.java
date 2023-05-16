package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        nestedIfStatement();
        switchCaseDefaultStatement();
    }

    private static void nestedIfStatement() {
        Scanner in = new Scanner(System.in);
        System.out.print("Today is: ");
        int dayNumber = in.nextInt();

        if (dayNumber >= 0 && dayNumber <= 6) {
            if (dayNumber == 0) {
                System.out.println("Day: Sunday");
            } else if (dayNumber == 1) {
                System.out.println("Day: Monday");
            } else if (dayNumber == 2) {
                System.out.println("Day: Tuesday");
            } else if (dayNumber == 3) {
                System.out.println("Day: Wednesday");
            } else if (dayNumber == 4) {
                System.out.println("Day: Thursday");
            } else if (dayNumber == 5) {
                System.out.println("Day: Friday");
            } else {
                System.out.println("Day: Saturday");
            }
        } else {
            System.out.println("Not a valid day");
        }
    }

    private static void switchCaseDefaultStatement() {
        Scanner in = new Scanner(System.in);
        System.out.print("Today is: ");
        int dayNumber = in.nextInt();

        String todayIs = switch (dayNumber) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not a valid day";
        };
        System.out.println("Day: " + todayIs);
    }
}
