package io.codelex.miscellaneous.triviaGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static io.codelex.miscellaneous.triviaGame.TriviaGame.MAX_OPTIONS;

class OptionGenerator {
    public static List<Integer> generateOptions(Random random, int randomNumber) {
        List<Integer> options = new ArrayList<>();
        options.add(randomNumber);

        while (options.size() < MAX_OPTIONS) {
            int option = random.nextInt(100) + 1;
            if (!options.contains(option)) {
                options.add(option);
            }
        }

        Collections.shuffle(options);
        return options;
    }
}