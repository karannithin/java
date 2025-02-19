package com.wipro.java.designhashmap;

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

class MyHashMap<K, V> {
    private static final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        buckets[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void display() {
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    System.out.println(entry);
                }
            }
        }
    }

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + " -> " + value;
        }
    }
}

public class StudentMapApp {
    public static void main(String[] args) {
        MyHashMap<String, List<Student>> studentMap = new MyHashMap<>();

        Student[] students = {
            new Student("Alice", 101),
            new Student("Bob", 102),
            new Student("Alice", 101),
            new Student("Charlie", 103),
            new Student("David", 104),
            new Student("Eve", 105),
            new Student("Frank", 106),
            new Student("Grace", 107),
            new Student("Bob", 102),
            new Student("Helen", 108)
        };

        for (Student s : students) {
            List<Student> list = studentMap.get(s.name);
            if (list == null) {
                list = new ArrayList<>();
                studentMap.put(s.name, list);
            }
            list.add(s);
        }

        studentMap.display();
    }
}
