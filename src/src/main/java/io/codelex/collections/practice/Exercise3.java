package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Red");
        mySet.add("Black");
        mySet.add("Yellow");
        mySet.add("Green");
        mySet.add("Purple");
        System.out.println("Should have 5 elements: " + mySet);

        for (String element : mySet) {
            System.out.println(element);
        }

        mySet.clear();
        System.out.println("Should be empty: " + mySet);

        mySet.add("Green");
        mySet.add("Orange");
        mySet.add("Green");
        mySet.add("Purple");

        boolean hasDuplicates = mySet.stream().distinct().count() != mySet.size();

        if (hasDuplicates) {
            System.out.println("The set contains duplicate strings.");
        } else {
            System.out.println("The set does not contain any duplicate strings.");
        }
    }
}