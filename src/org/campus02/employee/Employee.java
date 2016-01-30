package org.campus02.employee;

import java.util.ArrayList;

public class Employee {
	private int empNumber;
	private String name;
	private double salary;
	private String department;
	private int counter=0;
	private String role;
	private Employee superior;
	private ArrayList<Employee> subortinates = new ArrayList<>();
	
	public Employee(int empNumber, String name, double salary, String department) {
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	//für Erweiterung wurde ein neuer Konstruktor angelegt
	public Employee(int empNumber, String name, double salary, String department, String role) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.role = role;
	}
	
	public void addSubortinates(Employee e){
		subortinates.add(e);
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getCounter() {
		return counter;
	}

	public String getRole() {
		return role;
	}

	public Employee getSuperior() {
		return superior;
	}

	public ArrayList<Employee> getSubortinates() {
		return subortinates;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

	public void setSubortinates(ArrayList<Employee> subortinates) {
		this.subortinates = subortinates;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", salary=" + salary + ", department="
				+ department + ", counter=" + counter + ", role=" + role + ", superior=" + superior + ", subortinates="
				+ subortinates + "]";
	}


	
	
	
	
	

}
