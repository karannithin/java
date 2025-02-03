package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car {
	

	private String carBrand;
	private String carModel;
	private String carColour;
	private float carPrice;
	
	//setters and getters for car class
	public String getCarBrand() {
		return carBrand;
	}



	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}



	public String getCarModel() {
		return carModel;
	}



	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}



	public String getCarColour() {
		return carColour;
	}



	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}



	public float getCarPrice() {
		return carPrice;
	}



	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	
	public void displayCarInformation()
	{
		System.out.println("Car Brand : "+this.carBrand);
		System.out.println("Car Model: "+this.carModel);
		System.out.println("Car Colour : "+this.carColour);
		System.out.println("Car Price : "+this.carPrice);
	}
	

}
