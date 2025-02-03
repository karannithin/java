package com.wipro.java.oops.abstraction;

public class Tesla extends Car {

	@Override
	void carStartEngine() {
		System.out.println("Tesla has started");		
	}

	@Override
	void carBrake() {
		System.out.println("Tesla has stopped gradually");	
	}

}
