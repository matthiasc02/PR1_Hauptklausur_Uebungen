package org.campus02.employee;

import java.util.ArrayList;

public class EmployeeManager {
	private ArrayList<Employee> employees = new ArrayList<>();
	
	void addEmployee(Employee e){
		employees.add(e);
	}
	
	Employee findByMaxSalary(){
		double maxsalary=0;
		Employee MA = null;
		
		for (Employee employee : employees) {
			if(employee.getSalary()>maxsalary){
				maxsalary=employee.getSalary();
				MA=employee;
			}	
						
		}
		return MA;
	}
	
	Employee findByEmpNumber(int number){
		Employee MA=null;
		for (Employee employee : employees) {
			if(employee.getEmpNumber() == number){
				MA=employee;
			}
		}		
		return MA;		
	}
	
	public ArrayList<Employee> listAll(){
		return employees;
	}
	
	ArrayList<Employee> findByDepartment(String department){
		ArrayList<Employee> depList = new ArrayList<>();
		for (Employee employee : employees) {
			if(employee.getDepartment().equals(department)){
				depList.add(employee);
			}
		}
		
		return depList;		
	}


}
