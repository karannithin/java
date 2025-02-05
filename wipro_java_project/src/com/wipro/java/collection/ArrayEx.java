package com.wipro.java.collection;

/**
 * 
 */
public class ArrayEx {
	public static void main(String [] args) {
		int arr[] = new int[5];// // Declaring and initializing an array
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		 System.out.println("Using for loop:");// // Using a for loop to iterate over the array
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);  
	        }

	}
}

