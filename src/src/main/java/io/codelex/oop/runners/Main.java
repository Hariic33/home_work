package io.codelex.oop.runners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input minutes spent in the marathon: ");
        int marathonTime = scan.nextInt();

        if (marathonTime < 0 || marathonTime > 300) {
            System.out.println("Input a number between 0 and 300.");
        } else {
            Runner runnerLevel = Runner.getFitnessLevel(marathonTime);
            System.out.println("Runner level: " + runnerLevel);
        }
    }
}