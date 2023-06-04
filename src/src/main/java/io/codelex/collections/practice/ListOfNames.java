package io.codelex.collections.practice;

import java.util.*;

public class ListOfNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> nameList = new HashSet<>();

        while (true) {
            System.out.print("Enter name: ");
            String name = scan.nextLine().trim();

            if (name.isEmpty()) {
                break;
            }
            nameList.add(name);
        }
        List<String> sortedNames = new ArrayList<>(nameList);
        Collections.sort(sortedNames);

        System.out.print("Unique name list contains: ");

        for (String uniqueNames : sortedNames)
            System.out.print(uniqueNames + " ");
    }
}