package com.wipro.java.practice;

import java.util.Scanner;

//Node class for the linked list
class Node<T> {
 T data;
 Node<T> next;

 public Node(T data) {
     this.data = data;
     this.next = null;
 }
}

//Generic Stack class using a linked list
class Stack<T> {
 private Node<T> top;

 public Stack() {
     this.top = null;
 }

 // Push operation
 public void push(T item) {
     Node<T> newNode = new Node<>(item);
     if (top == null) {
         top = newNode;
     } else {
         newNode.next = top;
         top = newNode;
     }
 }

 // Pop operation
 public T pop() {
     if (isEmpty()) {
         return null;
     }
     T data = top.data;
     top = top.next;
     return data;
 }

 // Peek operation
 public T peek() {
     if (isEmpty()) {
         return null;
     }
     return top.data;
 }

 // Check if the stack is empty
 public boolean isEmpty() {
     return top == null;
 }
}

//Main class to test the stack implementation
public class Hello {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Integer stack
     Stack<Integer> integerStack = new Stack<>();
     System.out.println("Enter integers (enter a non-integer to stop):");
     while (scanner.hasNextInt()) {
         int userInput = scanner.nextInt();
         integerStack.push(userInput);
     }
     scanner.nextLine(); // Clear the buffer

     // Perform operations on integer stack
     System.out.println("Peek: " + integerStack.peek());
     System.out.println("Pop: " + integerStack.pop());
     System.out.println("Is Empty: " + integerStack.isEmpty());
     System.out.println("Pop: " + integerStack.pop());
     System.out.println("Pop: " + integerStack.pop());
     System.out.println("Is Empty: " + integerStack.isEmpty());

     // String stack
     Stack<String> stringStack = new Stack<>();
     System.out.println("Enter strings (enter an empty string to stop):");
     while (true) {
         String userInput = scanner.nextLine();
         if (userInput.isEmpty()) {
             break;
         }
         stringStack.push(userInput);
     }

     // Perform operations on string stack
     System.out.println("Peek: " + stringStack.peek());
     System.out.println("Pop: " + stringStack.pop());
     System.out.println("Is Empty: " + stringStack.isEmpty());

     scanner.close();
 }
}