package com.wipro.java.oops.polymorphism;

/**
 * Parent class = car
 * Child class = benz
 * Extends is  keyword
 */
public class Benz extends Car{
	
	public static void main(String[] args) {
		/**
		 *performing dynamic polymorphism
		 */
		
		
	Car a = new Benz();
	a.setCarBrand("Benz");
	a.setCarModel("G63");
	a.setCarColour("Matt Black");
	a.setCarPrice(100000000f);
	
	a.displayCarInformation();
	}
}
