package com.wipro.java.collection;


import java.util.LinkedList;
import java.util.List;

/**
 * 
 */
public class LinkedListTest {
	public static void main(String[]  args) {
		
		// Creating a LinkedList and adding elements
		List <Integer> n1 = new LinkedList <Integer>();
		
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
            n1.add(i);
        }
		
		 // Printing the initial LinkedList
		System.out.println("Initial LinkedList: " +n1);
		
		 // Removing the element at index 3
		n1.remove(3);
		System.out.println("After removing :"+n1);
		
		   // Printing elements one by one
		 System.out.print("Elements in LinkedList: ");
	        for (int i = 0; i < n1.size(); i++) {
	            System.out.print(n1.get(i) + " ");
	        }
	  }
}
