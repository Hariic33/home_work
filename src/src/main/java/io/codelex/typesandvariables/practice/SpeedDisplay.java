package io.codelex.typesandvariables.practice;
import java.util.Scanner;
public class SpeedDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double distance = input.nextDouble();

        System.out.print("Input hours: ");
        int hours = input.nextInt();

        System.out.print("Input minutes: ");
        int minutes = input.nextInt();

        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        double totalTimeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double MetersPerSecond = distance / totalTimeInSeconds;
        double KilometersPerHour = (distance / 1000) / (totalTimeInSeconds / 3600);
        double MilesPerHour = KilometersPerHour / 1.609;

        System.out.printf("Your speed in meters/second is: " + MetersPerSecond);
        System.out.println();
        System.out.printf("Your speed in km/h is: " + KilometersPerHour);
        System.out.println();
        System.out.printf("Your speed in miles/h is: " + MilesPerHour);
    }
}