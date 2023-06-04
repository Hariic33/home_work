package io.codelex.collections.practice.FlightPlanner;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class FlightPlanner {
    static final Charset charset = Charset.defaultCharset();
    static final String file = "src/src/main/resources/collections/flights.txt";

    static Map<String, List<String>> readFlightsFromFile() throws IOException {
        Map<String, List<String>> flights = new HashMap<>();

        final Path path = Paths.get(file).toAbsolutePath();
        try (Stream<String> lines = Files.lines(path, charset)) {
            lines.forEach(line -> {
                String[] cities = line.split("->");
                String origin = cities[0].trim();
                String destination = cities[1].trim();

                flights.computeIfAbsent(origin, key -> new ArrayList<>()).add(destination);
            });
        }
        return flights;
    }

    static List<String> planRoundTripRoute(String startCity, Map<String, List<String>> flights) {
        List<String> route = new ArrayList<>();
        route.add(startCity);

        String currentCity = startCity;
        while (true) {
            List<String> destinations = flights.get(currentCity);
            if (destinations == null || destinations.isEmpty()) {
                break;
            }
            System.out.println("Destinations from " + currentCity + ":");
            for (String destination : destinations) {
                System.out.println(destination);
            }
            System.out.println();

            System.out.println("To select the next city, enter the destination:");
            Scanner scanner = new Scanner(System.in);
            String nextCity = scanner.nextLine().trim();
            if (destinations.contains(nextCity)) {
                route.add(nextCity);
                if (nextCity.equals(startCity)) {
                    break;
                }
                currentCity = nextCity;
            } else {
                System.out.println("Invalid destination selection.");
            }
        }
        return route;
    }

    static void printRoute(List<String> route) {
        System.out.println("Route chosen:");
        for (String city : route) {
            System.out.println(city);
        }
        System.out.println();
    }
}