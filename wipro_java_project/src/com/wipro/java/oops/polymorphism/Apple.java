package com.wipro.java.oops.polymorphism;

/**
 * Parent class = Laptop
 * Child class = Apple
 * Extends is a keyword
 */
public class Apple extends Laptop {

	public static void main(String[] args) {
		Laptop laptop = new Apple();

        laptop.setBrandName("Apple");
        laptop.setProcessorType("M1 Pro");
        laptop.setRamSize("16GB");
        laptop.setPrice(250000.99f);

        laptop.displayLaptopInformation();
	}

}
