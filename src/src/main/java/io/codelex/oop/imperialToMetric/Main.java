package io.codelex.oop.imperialToMetric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input value: ");
        int value = scanner.nextInt();

        double result1 = converter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(value + " meters = " + result1 + " yards");

        double result2 = converter.convert(value, ConversionType.YARDS_TO_METERS);
        System.out.println(value + " yards = " + result2 + " meters");

        double result3 = converter.convert(value, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(value + " centimeters = " + result3 + " inches");

        double result4 = converter.convert(value, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(value + " inches = " + result4 + " centimeters");

        double result5 = converter.convert(value, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(value + " kilometers = " + result5 + " miles");

        double result6 = converter.convert(value, ConversionType.MILES_TO_KILOMETERS);
        System.out.println(value + " miles = " + result6 + " kilometers");
    }
}