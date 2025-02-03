package com.wipro.java.oops.inheritance;

/**
 * Parent class = Employee
 * Child class = Projectlead
 * Keyword = extends
 */
public class Projectlead extends Employee {

	public Projectlead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
//	     ProjectLead projectLead1 = new ProjectLead();
//	     ProjectLead projectLead2 = (ProjectLead) new Employee();

	    // Child object is instantiated from child constructor
	    // Parent class consumes the properties and behaviors of the child class

	    Employee teamLead = new Projectlead();

	    teamLead.setDepartment("Project Lead"); // Setting Project Lead division
	    teamLead.setId(104);         // Setting Project Lead ID
	    teamLead.setName("Noel");    // Setting Project Lead Name
	    teamLead.setSalary(50000);    // Setting Project Lead Salary

	    System.out.println("Division - " + teamLead.getDepartment());
	    System.out.println("Employee ID - " + teamLead.getId());
	    System.out.println("Employee Name - " + teamLead.getName());
	    System.out.println("Employee Salary - " + teamLead.getSalary());
	}


}
