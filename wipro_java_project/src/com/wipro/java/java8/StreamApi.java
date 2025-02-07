package com.wipro.java.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamApi {

	public StreamApi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Nithin","Avinash","Tharun","Vishal","Johnny");
		List<String> stream1 = list.stream().filter(name->name.startsWith("J")).collect(Collectors.toList());
		System.out.println(stream1);
		
		
		List<String> names = Arrays.asList("Nithin","Avinash","Tharun","Vishal","Johnny");
		List<String> stream2 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stream2);
		
	}

}