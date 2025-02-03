package com.wipro.java.oops.inheritance;

/** Parent class- Employee
 * Child class- Manager
 * EXTENDS  = Keyword
 */
public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
	    Employee employee = new Manager();

	    employee.setDepartment("Manager");  // Setting Manager department
	    employee.setId(135);               // Setting Manager ID
	    employee.setName("Nithin");           // Setting Manager Name
	    employee.setSalary(30000);          // Setting Manager Salary

	    System.out.println("Department - " + employee.getDepartment());
	    System.out.println("ID - " + employee.getId());
	    System.out.println("Name - " + employee.getName());
	    System.out.println("Salary - " + employee.getSalary());
	}
}
