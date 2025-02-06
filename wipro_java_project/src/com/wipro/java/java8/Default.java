package com.wipro.java.java8;

//First Interface
interface AnimalInterface {
 default void display() {
     System.out.println("Default display() from AnimalInterface");
 }
}

//Second Interface
interface PlantInterface {
 default void display() {
     System.out.println("Default display() from PlantInterface");
 }
}

//Class implementing both interfaces
class Default implements AnimalInterface, PlantInterface {
 
 // Overriding display() to resolve method conflict
 @Override
 public void display() {
     AnimalInterface.super.display(); // Call AnimalInterface's default method
     PlantInterface.super.display(); // Call PlantInterface's default method
     System.out.println("Overridden display() in Nature class");
 }

 public static void main(String[] args) {
     Default obj = new Default();
     obj.display(); // Calls the overridden method
 }
}

