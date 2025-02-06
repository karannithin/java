package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
	
	public static void main(String[]  args) {
		// Creating a List and adding elements
		List <Integer> n1 = new ArrayList <Integer>();
		n1.add(10);
		n1.add(20);
		n1.add(30);
		n1.add(40);
		//Creating list n2 and adding elements
		List<Integer> n2 = new ArrayList<>();
	    n2.add(40);
	    n2.add(50);
		//adding all n2 elements from 1st index of n1
	    n1.addAll(1,n2);
	    System.out.println("After adding:"+ n1);
	    //Removing the element at index 3
	    n1.remove(3);
	    System.out.println("After removing :"+n1);
	    //Replace the 1st element with 15
	    n1.set(1,15);
	    System.out.println("After using set:"+n1);
	}
}
