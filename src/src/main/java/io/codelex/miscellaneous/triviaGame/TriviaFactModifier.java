package io.codelex.miscellaneous.triviaGame;

class TriviaFactModifier {
    public static String modifyTriviaFact(String fact, int randomNumber) {
        return fact.replace(String.valueOf(randomNumber), "?");
    }
}