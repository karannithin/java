package com.wipro.java.exception;

public class ExceptionExample {
	
	static int x = 5;//static variable
	
public static void main(String[] args){
	int num1 = 50, num2  = 0,data;// declaring the variables
	try {
		// Attempting to perform division, which will cause an ArithmeticException since num2 is 0
		data = num1/num2;// This line will throw ArithmeticException because of division by zero
	} catch(Exception e) {
		// Catching any exceptions and printing the error message
		System.out.println("An error occured:"+e.toString());
	}
	finally {
		// The 'finally' block will always execute regardless of whether an exception occurred or not
		System.out.println("I am always executed");
	}
	// After exception handling, this code will continue execution
	System.out.println("continuing the excetuion afer exception handling");
}
}