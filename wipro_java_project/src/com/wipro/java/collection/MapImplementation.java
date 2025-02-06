package com.wipro.java.collection;


import java.util.HashMap;
import java.util.Map;


/**
 * 
 */
public class MapImplementation {// Class name
	public static void main(String[] args) { // Main method
		
		// Creating a HashMap that stores Integer keys and String values
		 Map<Integer, String> map = new HashMap<>();
		 
		 //adding elements
		 map.put(1,"Vannila");
		 map.put(2,"Choclate");
		 map.put(3, "Butterscoth");
		 
		 // displaying the maps
		 System.out.println("Intialmap:"+map);
		 
		 //using get method
		 String value = map.get(2);
		 System.out.println("Value for key 2: " + value);
		 
		 //using remove method
		 map.remove(3);
		 System.out.println("Map after removing key 3: " + map);
		 
		 //iterating over the map
		 System.out.println("Iterating over the map:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	}
}
