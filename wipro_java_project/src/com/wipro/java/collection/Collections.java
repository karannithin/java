package com.wipro.java.collection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        
        // Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList + "\n");

        // Using LinkedList
        List<Integer> n1 = new LinkedList<>();
        int n = 5;

        for (int i = 1; i <= n; i++) {
            n1.add(i);
        }

        System.out.println("Initial LinkedList: " + n1);

        if (n1.size() > 3) {
            n1.remove(3);
            System.out.println("After removing index 3: " + n1);
        }

        System.out.print("Elements in LinkedList: ");
        for (Integer num : n1) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Using HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Bhavana");
        hashMap.put(2, "Snehitha");
        hashMap.put(3, "Darshini");
        
        System.out.println("HashMap: " + hashMap + "\n");

        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
