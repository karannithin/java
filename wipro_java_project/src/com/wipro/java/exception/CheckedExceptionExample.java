package com.wipro.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
	
	public static void main(String[] args) {
	try {
		// Attempting to open a file that may not exist (Checked Exception)
        File file = new File("non_existent_file.txt");
        FileReader fileReader = new FileReader(file); // This line throws FileNotFoundException
        System.out.println("File opened successfully!");
		} catch(FileNotFoundException e) {
			 // Handling the checked exception (FileNotFoundException)
            System.out.println("File not found: " + e.toString());
		}finally {
            // The 'finally' block will execute whether or not the exception is thrown
            System.out.println("Finally block executed.");
        }
	 System.out.println("Execution continues after exception handling.");
	}

}
