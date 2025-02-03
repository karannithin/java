package com.wipro.java.oops.encapsulation;

/**
 * 
 */
public class Animal {
	

	private String species;
	private int teeth;
	
	
	public Animal(String species, int teeth) {
		super();
		this.species = species;
		this.teeth = teeth;
	}
	

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}


	public int getTeeth() {
		return teeth;
	}


	public void setTeeth(int teeth) {
		if(teeth<20) {

			  System.out.println("Its a baby with less than 20 teeth.");
			}
			else {
				this.teeth = teeth;	
			}
	}

	
	public static void main(String[] args) {
	
		Animal animalA1 = new Animal ("Horse",24);
		
		System.out.println("Species : " +animalA1.getSpecies());
		System.out.println("Teeth : " +animalA1.getTeeth());
		System.out.println();

		animalA1.setSpecies("Horse");
		animalA1.setTeeth(24);
		System.out.println("Updated Species: " +animalA1.getSpecies());
		System.out.println("Updated Teeth: " + animalA1.getTeeth());
		System.out.println();

		animalA1.setTeeth(5);
		

	}

}
