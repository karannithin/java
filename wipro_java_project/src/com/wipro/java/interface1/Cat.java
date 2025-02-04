package com.wipro.java.interface1;

public class Cat implements Animal {

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Cat says Meow");
		}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		 System.out.println("Cat eats chicken");
		 }
		 
	public static void main(String[] args) {
		 Animal cat = new Cat();  // Creating an instance of Cat
		 cat.makeSound();  // Calling the sound method (Cat says Meow)
		 cat.eat();   // Calling the move method (Cat walks gracefully)	 
	}

}
