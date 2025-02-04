package com.wipro.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BothExceptionExample {
	public static void main(String[] args) {
		// Unchecked Exception Example
		try {
            String str = null; 
            System.out.println(str.length());  // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception occurred: " + e.toString());
        }		// Checked Exception Example
		try {
			java.io.FileReader file = new java.io.FileReader("Not exist");// This will cause FileNotFoundException
		}catch(java.io.FileNotFoundException e) {
			System.out.println("Checked Exception : "+ e.toString());
		}
		   System.out.println("Program continues after exceptions.");
	}
	
}
