package com.wipro.java.java8;

//Main class
public class Shapes{
public static void main(String[] args) {
   // Using class implementations
   Shape square = new Square();
   System.out.println("Square Area: " + square.area(4));

   Shape circle = new Circle();
   System.out.println("Circle Area: " + circle.area(5));
   
   // Calling static method from interface
   Shape.shapeInfo();
}
}