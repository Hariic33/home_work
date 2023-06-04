package io.codelex.collections.practice.FlightPlanner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static io.codelex.collections.practice.FlightPlanner.FlightPlanner.*;

public class FlightTrip {
    public static void main(String[] args) throws IOException {
        Map<String, List<String>> flights = readFlightsFromFile();
        List<String> cities = new ArrayList<>(flights.keySet());

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("What would you like to do?");
            System.out.println("To display list of the cities, press 1");
            System.out.println("To exit program, press #");

            input = scanner.nextLine().trim();

            if (input.equals("1")) {
                System.out.println("List of cities:");
                for (String city : cities) {
                    System.out.println(city);
                }
                System.out.println();
                System.out.println("To select a city from which you would like to start, enter the city name:");
                String startCity = scanner.nextLine().trim();
                if (cities.contains(startCity)) {
                    List<String> route = planRoundTripRoute(startCity, flights);
                    printRoute(route);
                } else {
                    System.out.println("Invalid city selection.");
                }
            }
        } while (!input.equals("#"));
    }
}