package com.wipro.java.collection;

public class Movie1 {

		private String name; // Movie name
		private double rating; // Movie rating
		private int year; // Movie year

		// Constructor to initialize movie details
		public Movie1(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;

		}
		// Getter methods
		public String getName() {
		return name;
		}

		public double getRating() {
		return rating;
		} 
		
		public int getYear() {
		return year;
		}
}