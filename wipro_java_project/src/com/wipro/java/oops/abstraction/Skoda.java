package com.wipro.java.oops.abstraction;


public class Skoda extends Car{
	/*
	 * Implementing the abstract methods in child class
	 */
	@Override
	void carStartEngine() {
		System.out.println("Skoda has Started");

	}

	@Override
	void carBrake() {
		System.out.println("Skoda has stopped gradually");
	}

}
