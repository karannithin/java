package com.wipro.java.oops.inheritance;

/**
 * Parent class = Employee
 * Child class = Developer
 * Keyword = extends
 */
public class Developer extends Employee{

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
	    Employee employee = new Developer();

	    employee.setDepartment("Developer"); // Setting Developer department
	    employee.setId(123);                // Setting Developer ID
	    employee.setName("Karan");           // Setting Developer Name
	    employee.setSalary(25006);           // Setting Developer Salary

	    System.out.println("Department - " + employee.getDepartment());
	    System.out.println("ID - " + employee.getId());
	    System.out.println("Name - " + employee.getName());
	    System.out.println("Salary - " + employee.getSalary());
	}


}
