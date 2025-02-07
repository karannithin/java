package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiNum {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(15, 8, 22, 3, 10, 5, 30);

        // Sorting numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);

        // Finding the minimum and maximum numbers
        int min = numbers.stream().min(Integer::compare).get();
        int max = numbers.stream().max(Integer::compare).get();
        
        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);
    }
}
