package com.wipro.java.java8;

interface Shape {
    // Abstract method (1 required in a Functional Interface)
    double area(double dimension);

    // Default method 1
    default void displayShape(String shapeName) {
        System.out.println("Calculating properties for: " + shapeName);
    }

    // Default method 2
    default double perimeter(double dimension) {
        System.out.println("Calculating perimeter...");
        return 4 * dimension; // Default assumes square shape
    }

    // Static method 1
    static void shapeInfo() {
        System.out.println("Shapes have different formulas for area and perimeter.");
    }

    // Static method 2
    static String shapeType() {
        return "Geometric Shape";
    }
}
//Implementing class for Square
class Square implements Shape {
    @Override
    public double area(double side) {
        displayShape("Square");
        return side * side;
    }

    @Override
    public double perimeter(double side) {
        return 4 * side;
    }
}

// Implementing class for Circle
class Circle implements Shape {
    private static final double PI = 3.1416;

    @Override
    public double area(double radius) {
        displayShape("Circle");
        return PI * radius * radius;
    }

    @Override
    public double perimeter(double radius) {
        return 2 * PI * radius;
    }
}
