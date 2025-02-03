package com.wipro.java.oops;

/**
 * POJO:plain old java object
 * No constructor
 * getters have return value
 * setter has no return value
 * properties are determined by using private fields
 * values are behaviors are determined through setters
 * toString will convert the entire animal class with properties and behaviors
 * 
 */
public class Animal {
	
	

	private String aniName ; //animal name
	private int age ;  // age of the animal
	private float weight; // weight of the animal
	
	//getter and setter
	public String getAniName() {
		return aniName;
	}

	public void setAniName(String aniName) {
		this.aniName = aniName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Animal [aniName=" + aniName + ", age=" + age + ", weight=" + weight + "]";
	}

	
}
