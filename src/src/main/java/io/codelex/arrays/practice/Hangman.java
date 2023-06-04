package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static final String[] WORDS = {"codelex", "java", "computer", "programmer", "homework"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String wordToGuess = WORDS[random.nextInt(WORDS.length)];
        int maxTries = 4;
        int tries = 0;
        StringBuilder guessedWord = new StringBuilder("_".repeat(wordToGuess.length()));
        StringBuilder missedLetters = new StringBuilder();

        while (tries < maxTries && guessedWord.indexOf("_") >= 0) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Word:\t" + guessedWord);
            System.out.println("Misses:\t" + missedLetters);
            System.out.print("Guess:\t");
            char guess = scanner.nextLine().charAt(0);

            if (wordToGuess.indexOf(guess) >= 0) {
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                    }
                }
            } else {
                missedLetters.append(guess);
                tries++;
            }
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        if (guessedWord.indexOf("_") < 0) {
            System.out.println("Word:\t" + guessedWord);
            System.out.println("Misses:\t" + missedLetters);
            System.out.println("YOU GOT IT!");
        } else {
            System.out.println("Word:\t" + wordToGuess);
            System.out.println("Misses:\t" + missedLetters);
            System.out.println("GAME OVER!");
        }

        System.out.print("Play \"again\" or \"quit\"? ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("again")) {
            main(null);
        } else {
            System.out.println("Goodbye!");
        }
    }
}

