package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

class DateTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter current month: ");
        int month = scan.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("Wrong month");
        }

        System.out.print("Enter current day: ");
        int day = scan.nextInt();
        if (day > 31 || day < 1) {
            System.out.println("Wrong day");
        }

        System.out.print("Enter current year: ");
        int year = scan.nextInt();

        Date inputDate = new Date(month, day, year);
        inputDate.displayDate();

        Date setDate = new Date(1, 1, 1970);
        setDate.displayDate();

        setDate.setMonth(12);
        setDate.setDay(31);
        setDate.setYear(2024);
        setDate.displayDate();

        System.out.println("A year from now, it will be: " + inputDate.getMonth() + "/" + inputDate.getDay() + "/" + setDate.getYear());
    }
}
