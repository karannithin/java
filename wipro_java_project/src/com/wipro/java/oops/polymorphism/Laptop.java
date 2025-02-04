package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Laptop {
	
	private String brandName;//Brand name
	private String processorType;// processor 
	private String ramSize;// ram size
	private float price;// cost
	
	//Getters and setters
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProcessorType() {
		return processorType;
	}

	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void displayLaptopInformation() {
		System.out.println("Brand Name: " + this.brandName);
        System.out.println("Processor Type: " + this.processorType);
        System.out.println("RAM Size: " + this.ramSize);
        System.out.println("Price: " + this.price);
	}

}
