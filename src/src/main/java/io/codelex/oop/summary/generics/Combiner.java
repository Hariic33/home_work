package io.codelex.oop.summary.generics;

public class Combiner {

    public static <T, S> String combineTwoItems(T first, S second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }
}
