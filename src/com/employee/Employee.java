package com.employee;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	
	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

	
	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	//-------------------
	
	String getName() {
		return(this.firstName+this.lastName);
	}
	
	int getAnnualSalary() {
		return this.salary*12;
	}
	
	public int raiseSalary(int percent) {
		return this.salary+ ((this.salary*percent)/100);
	}

	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSalary()=" + getSalary() + ", getName()=" + getName() + ", getAnnualSalary()="
				+ getAnnualSalary() + "]";
	}
	
	
	
	
	
	
	
	
	
}
