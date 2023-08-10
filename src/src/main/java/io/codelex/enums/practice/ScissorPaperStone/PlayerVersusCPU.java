package io.codelex.enums.practice.ScissorPaperStone;

import java.util.Random;
import java.util.Scanner;

public class PlayerVersusCPU {

    public static void main(String[] args) {
        ScissorPaperStone[] choices = ScissorPaperStone.values();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Let us begin...");

        int numOfTrials = 0;
        int userWins = 0;
        int pcWins = 0;

        while (true) {
            System.out.println("Scissor-Paper-Stone");
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String userInput = scan.nextLine().toLowerCase();

            if (userInput.equals("q")) {
                System.out.println("\nNumber of trials: " + numOfTrials);
                double userWinsPercentage = ((double) 100 / numOfTrials * userWins);
                double pcWinsPercentage = ((double) 100 / numOfTrials * pcWins);
                System.out.println("I won " + pcWins + "(" + String.format("%.2f", pcWinsPercentage) + "%). You won " + userWins + "(" + String.format("%.2f", userWinsPercentage) + "%).");
                System.out.println("Bye!");
                break;
            }

            ScissorPaperStone userChoice = getUserChoice(userInput);
            if (userChoice == null) {
                System.out.println("Invalid input, try again...");
                continue;
            }

            ScissorPaperStone pcChoice = choices[random.nextInt(choices.length)];
            System.out.println("My turn: " + pcChoice);

            if (userChoice == pcChoice) {
                System.out.println("Tie!\n");
            } else if ((userChoice == ScissorPaperStone.STONE && pcChoice == ScissorPaperStone.SCISSOR)
                    || (userChoice == ScissorPaperStone.PAPER && pcChoice == ScissorPaperStone.STONE)
                    || (userChoice == ScissorPaperStone.SCISSOR && pcChoice == ScissorPaperStone.PAPER)) {
                System.out.println("You won!\n");
                userWins++;
            } else {
                System.out.println("I won!\n");
                pcWins++;
            }
            numOfTrials++;
        }
    }

    private static ScissorPaperStone getUserChoice(String userInput) {
        return switch (userInput) {
            case "s" -> ScissorPaperStone.SCISSOR;
            case "p" -> ScissorPaperStone.PAPER;
            case "t" -> ScissorPaperStone.STONE;
            default -> null;
        };
    }
}