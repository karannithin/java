package com.wipro.java.collection;

import java.util.*;
import java.util.Collections;

class MovieComparable implements Comparable<MovieComparable> {
private String title;
private double rating;
private int year;
	
public MovieComparable(String title,double rating , int year) {
	this.title = title;
	this.rating = rating;
	this.year = year;
}
public String getTitle() {
	return title;
}	
public double getRating() {
	return rating;
}
public int getYear() {
	return year;
}

@Override
public int compareTo(MovieComparable movie) {
	// TODO Auto-generated method stub
	return (int) (this.rating-movie.rating);
}

}
public class ComparableSort{
	public static void main (String [] args) {
		ArrayList<MovieComparable> movieList = new ArrayList<MovieComparable>();
		movieList.add(new MovieComparable("SpiderMan",9,2003));
		movieList.add(new MovieComparable("IronMan",9,2015));
		movieList.add(new MovieComparable("BatMan",9,2010));
		movieList.add(new MovieComparable("Cindrella",9,2005));
		movieList.add(new MovieComparable("Pushpa",9.2,2024));
		
		Collections.sort(movieList);
		
System.out.println("ArrayList Objects after sorting based on the rating");
		
		for(MovieComparable m :movieList)
		{
			System.out.println("Movie name :"+m.getTitle()+" , Movie Rating : "+m.getRating()+" Released Year : "+m.getYear());
		}

	}
}
