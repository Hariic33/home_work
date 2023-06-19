package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HoursWorked {
    public static void main(String[] args) {

        final int DAYS_A_WEEK = 7;
        final int WORKING_DAYS_A_WEEK = 5;
        final int HOURS_A_DAY = 24;
        final int HOURS_WORKED_PER_DAY = 8;

        LocalDate start = LocalDate.of(2021, 1, 12);
        LocalDate end = LocalDate.of(2023, 4, 2);

        long monthsEmployed = ChronoUnit.MONTHS.between(start.atStartOfDay(), end.atStartOfDay());
        System.out.println("Months employed: " + monthsEmployed + ".");

        long overallHours = ChronoUnit.HOURS.between(start.atStartOfDay(), end.atStartOfDay());
        System.out.println(overallHours + " hours between " + start + " and " + end + ".");

        long hoursAtWork = overallHours / DAYS_A_WEEK * WORKING_DAYS_A_WEEK / HOURS_A_DAY * HOURS_WORKED_PER_DAY;
        System.out.println(hoursAtWork + " hours spent at work.");

        System.out.println("Average time spent at work every month: " + hoursAtWork / monthsEmployed + " hours.");
    }
}