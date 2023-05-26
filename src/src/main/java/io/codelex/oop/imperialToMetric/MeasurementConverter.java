package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public double convert(int value, ConversionType conversionType) {
        return switch (conversionType) {
            case METERS_TO_YARDS -> value * 1.09361;
            case YARDS_TO_METERS -> value * 0.9144;
            case CENTIMETERS_TO_INCHES -> value * 0.393701;
            case INCHES_TO_CENTIMETERS -> value * 2.54;
            case KILOMETERS_TO_MILES -> value * 0.621371;
            case MILES_TO_KILOMETERS -> value * 1.60934;
        };
    }
}