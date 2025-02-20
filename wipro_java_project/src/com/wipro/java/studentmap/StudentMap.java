package com.wipro.java.studentmap;

import java.util.*;

class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}

public class StudentMap {
    public static void main(String[] args) {
        // HashMap to store duplicate student entries
        HashMap<String, List<Student>> studentMap = new HashMap<>();

        // List of 10 students with duplicate names and roll numbers
        Student[] students = {
            new Student("Nithin", 101),
            new Student("Karan", 102),
            new Student("Nithin", 101), // Duplicate
            new Student("johny", 103),
            new Student("Bunny", 104),
            new Student("Bhavana", 105),
            new Student("Subashe", 106),
            new Student("Chintu", 107),
            new Student("Bhavana", 102), // Duplicate
            new Student("Jyothi", 108)
        };

        // Storing students in the HashMap
        for (Student s : students) {
            studentMap.putIfAbsent(s.name, new ArrayList<>());
            studentMap.get(s.name).add(s);
        }

        // Displaying the contents of the HashMap
        for (Map.Entry<String, List<Student>> entry : studentMap.entrySet()) {
            System.out.println("Students with name " + entry.getKey() + ":");
            for (Student s : entry.getValue()) {
                System.out.println("  " + s);
            }
        }
    }
}
