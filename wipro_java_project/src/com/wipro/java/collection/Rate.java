package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class to sort through rating
public class Rate implements Comparator<Movie1> {

	//Sorting by rating 
		@Override
		public int compare(Movie1 m1, Movie1 m2) {
			
			return Double.compare(m1.getRating(), m2.getRating());
		}


		public static void main(String[] args) {
			//Creating a list of movies
			ArrayList<Movie1> m1 = new ArrayList<>();
			m1.add(new Movie1("Batman", 8.8, 2009));
			m1.add(new Movie1("IronMan", 8.6, 1995));
			m1.add(new Movie1("Bahubali", 9.5, 2017));
			
			//Sort movies by rating
			Collections.sort(m1, new Rate());
			System.out.println("\nMovies sorted by rating: ");
			for(Movie1 m : m1) {
				System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
			}

		}
}