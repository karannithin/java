package com.wipro.java.exception;

public class UncheckedExceptionExample {
	public static void main(String[] args) {
		int num1 = 10,num2 = 0,result;//declaring variables
		
		try {
			// This will cause an ArithmeticException (Unchecked Exception)
			result = num1/ num2;
			System.out.println("Result :"+result);
		}catch (ArithmeticException e) {
			 // Handling the unchecked exception (ArithmeticException)
			System.out.println("Error:"+e.toString());
		}finally {
			 // The 'finally' block is executed irrespective of the exception
			System.out.println("Finally Block of code is executed.");
		}
		
		System.out.println("Execution continous after exception handling");
	}
}
