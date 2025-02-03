package com.wipro.java.oops.polymorphism;

/**
 * Parent class = Car
 * Child class = Tata
 * Extends is a keyword
 */
public class Tata extends Car {
		public static void main(String[] args) {
		
			/**
			 * Performing Dynamic polymorphism
			 */

		
		Car a = new Tata();
		a.setCarBrand("Tata");
		a.setCarModel("Indica");
		a.setCarColour("White");
		a.setCarPrice(123456f);
		
		a.displayCarInformation();
		}
}

	
