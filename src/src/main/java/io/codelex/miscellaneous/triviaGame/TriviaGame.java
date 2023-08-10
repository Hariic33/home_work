package io.codelex.miscellaneous.triviaGame;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {
    protected static final int MAX_OPTIONS = 3;
    private static final int MAX_CORRECT_ANSWERS = 20;
    private Random random;
    private Scanner scanner;
    private int correctAnswers;

    public TriviaGame() {
        random = new Random();
        scanner = new Scanner(System.in);
        correctAnswers = 0;
    }

    public void playGame() {
        while (correctAnswers < MAX_CORRECT_ANSWERS) {
            int randomNumber = generateRandomNumber();

            TriviaApi triviaApi = new TriviaApi();
            String triviaFact = triviaApi.getTriviaFact(randomNumber);
            if (triviaFact == null) {
                System.out.println("Failed to retrieve trivia fact. Please try again.");
                continue;
            }

            String modifiedFact = TriviaFactModifier.modifyTriviaFact(triviaFact, randomNumber);

            System.out.println("Trivia fact: " + modifiedFact);

            List<Integer> options = OptionGenerator.generateOptions(random, randomNumber);

            System.out.println("Guess the number:");
            OptionDisplay.displayOptions(options);

            int userGuess = UserInput.getUserGuess(scanner);

            if (options.contains(userGuess)) {
                if (userGuess == randomNumber) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("Wrong answer. Game Over!");
                    break;
                }
            } else {
                System.out.println("Invalid option. Please try again.");
            }
            scanner.nextLine();
        }

        System.out.println("Correct answers: " + correctAnswers);
        scanner.close();
    }

    private int generateRandomNumber() {
        return random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        TriviaGame triviaGame = new TriviaGame();
        triviaGame.playGame();
    }
}