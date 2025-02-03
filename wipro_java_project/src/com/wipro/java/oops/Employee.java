package com.wipro.java.oops;

/**
 * POJO: Plain old java object access thru getter/setter
 */
public class Employee {
	
	
	private int account_no; //employee account no
	private String empName; //employee name
	private int empAge;     //employee age
	
	//getter and setter(public access modifier indicates this method can be accessed by manger)
	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
