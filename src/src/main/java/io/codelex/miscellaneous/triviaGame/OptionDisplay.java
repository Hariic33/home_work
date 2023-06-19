package io.codelex.miscellaneous.triviaGame;

import java.util.List;

public class OptionDisplay {
    public static void displayOptions(List<Integer> options) {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }
}