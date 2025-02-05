package com.wipro.java.interface1;

public class Fish implements Animal {

	public Fish() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Fish make no sound");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish is eating algae");
	}
	public static void main(String[] args) {
        Animal fish = new Fish();  // Creating an instance of Fish
        fish.makeSound();  // Calling the sound method (Fish does not make sound)
        fish.eat();   // Calling the move method (Fish swims in water)
    }

}
