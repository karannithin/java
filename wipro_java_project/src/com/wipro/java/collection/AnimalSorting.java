package com.wipro.java.collection;

import java.util.*;
import java.util.Collections;

class Animal implements Comparable<Animal>
{
	private String animalName;
	private int animalAge;
	private double animalHeight;
	
	public Animal(String animalName, int animalAge, double animalHeight) {
		super();
		this.animalName = animalName;
		this.animalAge = animalAge;
		this.animalHeight = animalHeight;
	}

	@Override
	public int compareTo(Animal animal) 
	{
		return this.getAnimalAge() - animal.getAnimalAge();
	}

	public String getAnimalName() {
		return animalName;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public double getAnimalHeight() {
		return animalHeight;
	}
}

public class AnimalSorting implements Comparator<Animal>
{
	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getAnimalName().compareTo(a2.getAnimalName());
	}

	public static void main(String[] args) 
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Tiger", 10, 55.5));
		animals.add(new Animal("Lion", 12, 68.0));
		animals.add(new Animal("Dog", 5, 15.1));
		animals.add(new Animal("Rabbit", 8, 10.3));
		animals.add(new Animal("Deer", 9, 70.0));
		animals.add(new Animal("Fox", 7, 34.5));
		
		Collections.sort(animals);

		for(Animal a : animals)
		{
			System.out.println("Animal Name : "+a.getAnimalName()+" , Age : "+a.getAnimalAge()+" , Height : "+a.getAnimalHeight());
		}

		System.out.println("............................................................................");
		
		Collections.sort(animals , new AnimalSorting());
		
		for(Animal a : animals)
		{
			System.out.println("Animal Name : "+a.getAnimalName()+" , Age : "+a.getAnimalAge()+" , Height : "+a.getAnimalHeight());
		}
	}
}
