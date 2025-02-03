package com.wipro.java.oops.inheritance;

/**
 * Plain Old Java Object (POJO) is a simple object that doesn't adhere to any 
 * special restrictions or frameworks, typically used to represent data structures. 
 */
public class Employee {  

	// private members variables
	private int id; 
	private String name;
	private String department;
	private float Salary;

	//getters and setters for the members	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ",salary = "+Salary+"]";
	}
}


