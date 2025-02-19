package com.wipro.java.linkedcomparator;

import java.util.Collections;
import java.util.LinkedList;


public class LinkedListSort {
    public static void main(String[] args) {
        // Create a LinkedList of Person objects
        LinkedList<Person> people = new LinkedList<>();

        // Add elements to the LinkedList
        people.add(new Person("Nithin", 21));
        people.add(new Person("avinash", 22));
        people.add(new Person("tharun vishal", 23));

        // Display original list
        System.out.println("Original LinkedList:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort the LinkedList using the AgeComparator
        Collections.sort(people, new AgeComparator());

        // Display sorted list
        System.out.println("\nSorted LinkedList by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
