package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static VideoStore videoStore;

    public static void main(String[] args) {
        videoStore = new VideoStore();
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform:");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to list inventory");

            int choice = keyboard.nextInt();

            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> rentVideo(keyboard);
                case 3 -> returnVideo(keyboard);
                case 4 -> listInventory();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        scanner.nextLine();
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name:");
            String movieName = scanner.nextLine();
            System.out.println("Enter rating:");
            double rating = scanner.nextDouble();
            scanner.nextLine();
            videoStore.addVideo(movieName);
            videoStore.receiveRating(movieName, rating);
        }

        System.out.println("Videos added successfully.");
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter the video title to rent:");
        String title = scanner.next();
        videoStore.checkOutVideo(title);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter the video title to return:");
        String title = scanner.next();
        videoStore.returnVideo(title);
    }

    private static void listInventory() {
        videoStore.listInventory();
    }
}
