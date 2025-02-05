package com.wipro.java.oops.polymorphism;

/**
 * Parent class = Laptop
 * Child class = Asus
 * extends is a keyword
 */
public class Asus extends Laptop {
	
	public static void main(String[] args) {
		Laptop laptop = new Asus();

        laptop.setBrandName("Asus");
        laptop.setProcessorType("Ryzen 7");
        laptop.setRamSize("8GB");
        laptop.setPrice(75000.99f);

        laptop.displayLaptopInformation();
	}
}
