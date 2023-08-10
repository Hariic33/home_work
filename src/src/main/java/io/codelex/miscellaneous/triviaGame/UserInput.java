package io.codelex.miscellaneous.triviaGame;

import java.util.Scanner;

class UserInput {
    public static int getUserGuess(Scanner scanner) {
        System.out.print("Answer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}