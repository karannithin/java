package com.wipeo.java.treemap.fibonacci;

import java.util.*;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of Fibonacci terms
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();

        // TreeMap to store Fibonacci sequence
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();

        // Generate and store Fibonacci series
        for (int i = 0; i < n; i++) {
            fibonacciMap.put(i, fibonacci(i));
        }

        // Displaying the Fibonacci series
        System.out.println("Fibonacci series stored in TreeMap:");
        for (Map.Entry<Integer, Integer> entry : fibonacciMap.entrySet()) {
            System.out.println("Term " + entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    // Method to calculate Fibonacci number using recursion
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
