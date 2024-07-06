package com.tianyongwei.java8.collection.map;

import java.util.*;

public class TreeMapTest {

    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator for values
        Map<String, Integer> unsortedMap = new TreeMap<>();
        unsortedMap.put("A", 10);
        unsortedMap.put("B", 5);
        unsortedMap.put("C", 15);
        unsortedMap.put("D", 20);
        unsortedMap.put("E", 25);
        unsortedMap.put("F", 10);
        for (Map.Entry<String, Integer> entry : unsortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println("\n");

        // Create a comparator that compares Map entries by values
        // Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue();

        // Create a TreeMap to store the sorted entries
        TreeMap<String, Integer> sortedMap = new TreeMap<>(Comparator.comparingInt(unsortedMap::get));

        // Populate the sortedMap
        sortedMap.putAll(unsortedMap);

        // Print the sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println("--- 单独打印键 ---");
        for (String key : sortedMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("--- 单独打印值 ---");
        for (Integer value : sortedMap.values()) {
            System.out.println(value);
        }
        // 注意这里包含 F，但上面遍历的时候就是没有的
        System.out.println("sortedMap.containsKey(\"F\"): " + sortedMap.containsKey("F"));
    }
}
