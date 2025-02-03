package com.wipro.java.oops.abstraction;

/**
 * Main class for demonstrating the abstraction
 */
public class Test {

	public static void main(String[] args ) {
		Car SKODA = new Skoda();
		SKODA.carStartEngine();
		SKODA.carBrake();
		
		System.out.println("..........................................");
		
		Car TESLA = new Tesla();
		TESLA.carStartEngine();
		TESLA.carBrake();
	}

}
