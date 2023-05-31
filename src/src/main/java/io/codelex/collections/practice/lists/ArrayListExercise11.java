package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Pop");
        arrayList.add("Rock");
        arrayList.add("Hip Hop");
        arrayList.add("Country");
        arrayList.add("Jazz");
        arrayList.add("Electronic");
        arrayList.add("R&B");
        arrayList.add("Metal");
        arrayList.add("Reggae");
        arrayList.add("Classical");
        System.out.println(arrayList);

        arrayList.add(4, "Funk");
        System.out.println(arrayList);

        int lastIndex = arrayList.size() - 1;
        arrayList.set(lastIndex, "Alternative");
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        boolean containsFoobar = arrayList.contains("Foobar");
        System.out.println(containsFoobar);

        for (String elements : arrayList) {
            System.out.println(elements);
        }
    }

}
