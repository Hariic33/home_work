package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class ServerUpdate {
    public static final int DAYS_BETWEEN_SERVER_UPDATES = 14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter launch year: ");
        int launchYear = scanner.nextInt();

        System.out.print("Enter launch month: ");
        int launchMonth = scanner.nextInt();

        System.out.print("Enter launch day of month: ");
        int launchDayOfMonth = scanner.nextInt();

        LocalDate serverLaunchDate = LocalDate.of(launchYear, launchMonth, launchDayOfMonth);
        System.out.println("Input date: " + serverLaunchDate);

        System.out.print("Enter update year: ");
        int updateYear = scanner.nextInt();

        System.out.print("Enter update month: ");
        int updateMonth = scanner.nextInt();

        LocalDate serverUpdate = LocalDate.of(updateYear, updateMonth, launchDayOfMonth);
        System.out.println("Server update dates for " + serverUpdate.getMonth() + " " + serverUpdate.getYear() + ":");

        calculateServerUpdateDates(serverUpdate, serverLaunchDate);
    }

    public static void calculateServerUpdateDates(LocalDate serverUpdate, LocalDate serverLaunchDate) {
        LocalDate nextUpdateDate = serverLaunchDate.plusDays(DAYS_BETWEEN_SERVER_UPDATES);

        while (nextUpdateDate.getYear() <= serverUpdate.getYear() && nextUpdateDate.getMonthValue() <= serverUpdate.getMonthValue()) {
            if (nextUpdateDate.getYear() == serverUpdate.getYear() && nextUpdateDate.getMonthValue() == serverUpdate.getMonthValue()) {
                System.out.println(nextUpdateDate);
            }
            nextUpdateDate = nextUpdateDate.plusDays(DAYS_BETWEEN_SERVER_UPDATES);
        }
    }
}