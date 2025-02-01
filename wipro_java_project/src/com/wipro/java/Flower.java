/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {

	String nameValue;
	String colorValue;
	
	Flower(String name, String color){
		  this.nameValue=name;
		  this.colorValue=color;
	}
	void display() {
		System.out.println("Flower name :"+nameValue);
		System.out.println("Colour:"+ colorValue);
	}
	public static void main(String[] args) {
		Flower flowerrose = new Flower("Rose","Red");
		Flower flowerlily = new Flower("Lily","White");
		flowerrose.display();
		flowerlily.display();

	}

}
