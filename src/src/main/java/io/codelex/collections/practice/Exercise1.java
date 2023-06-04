package io.codelex.collections.practice;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "Volkswagen", "Mercedes", "Tesla"};

        List<String> carList = new ArrayList<>();
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Mercedes");
        carList.add("Volkswagen");
        carList.add("Mercedes");
        carList.add("Tesla");
        System.out.println(carList);

        Set<String> carSet = new HashSet<>();
        carSet.add("Audi");
        carSet.add("BMW");
        carSet.add("Honda");
        carSet.add("Mercedes");
        carSet.add("Volkswagen");
        carSet.add("Mercedes");
        carSet.add("Tesla");
        System.out.println(carSet);

        Map<String, String> carMap = new HashMap<>();
        carMap.put("Audi", "Germany");
        carMap.put("BMW", "Germany");
        carMap.put("Honda", "Japan");
        carMap.put("Mercedes", "Germany");
        carMap.put("Volkswagen", "Germany");
        carMap.put("Mercedes", "Germany");
        carMap.put("Tesla", "USA");
        System.out.println(carMap);
    }
}
