package org.campus02.employee;

import java.util.ArrayList;

public class EmployeeDemo {
		public static void main(String[] args) {
			
			EmployeeManager em = new EmployeeManager();
			
			Employee emp1 = new Employee(123, "Max Mustermann", 1000.0, "Engineering");
			em.addEmployee(emp1);
			
			Employee emp2 = new Employee(456, "Susi Sorglos", 2500.0, "Engineering");
			em.addEmployee(emp2);
			
			Employee emp3 = new Employee(789, "Ano Nym", 4900.0, "Management");
			em.addEmployee(emp3);
			
			
			
			Employee empMaxSalary = em.findByMaxSalary();
			System.out.println("has MAX salary -> " + empMaxSalary);
			
			Employee empByNumber1 = em.findByEmpNumber(123);
			System.out.println("has number 123 -> " + empByNumber1);
			
			Employee empByNumber2 = em.findByEmpNumber(999);
			System.out.println("has number 999 -> " + empByNumber2);
			
			ArrayList<Employee> byDept = em.findByDepartment("Engineering");
			System.out.println("Engineering (" + byDept.size()+") -> "+byDept);
						
			// alle Mitarbeiter ausgeben
			System.out.println(em.listAll());
			System.out.println("-----------------------------------------");
			//neue Mitarbeiter für rekursion anlegen (neuer Konstruktor)

			Employee Mitarbeiter1 = new Employee(1, "Fred", 1000000, "", "CEO");
			em.addEmployee(Mitarbeiter1);
						
			Employee Mitarbeiter2 = new Employee(1, "Fred2", 100000, "", "CTO");
			Mitarbeiter2.setSuperior(Mitarbeiter1);
			em.addEmployee(Mitarbeiter2);
			
			Employee Mitarbeiter3 = new Employee(1, "Fred3", 20000, "", "Dev");
			Mitarbeiter3.setSuperior(Mitarbeiter2);
			em.addEmployee(Mitarbeiter3);
			
			Employee Mitarbeiter4 = new Employee(1, "Fred4", 10000, "", "Dev");
			Mitarbeiter4.setSuperior(Mitarbeiter2);
			em.addEmployee(Mitarbeiter3);
			
			Employee Mitarbeiter5 = new Employee(1, "Fred5", 10000, "", "HR");
			Mitarbeiter5.setSuperior(Mitarbeiter1);
			em.addEmployee(Mitarbeiter5);
			
			//Chain of Command
			System.out.println(OrganigramHandler.getChainOfCommand(Mitarbeiter4));
			System.out.println("-----------------------------------------");
			
			//untergeordnete Mitarbeiter zuweisen, geht erst nach der Initialisierung
			Mitarbeiter1.addSubortinates(Mitarbeiter2);
			Mitarbeiter1.addSubortinates(Mitarbeiter5);
			
			Mitarbeiter2.addSubortinates(Mitarbeiter3);
			Mitarbeiter2.addSubortinates(Mitarbeiter4);
			
			System.out.println(OrganigramHandler.processHierarchy(Mitarbeiter1));
			

		}

	}