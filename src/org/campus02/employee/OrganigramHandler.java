package org.campus02.employee;

public class OrganigramHandler {
	
	// Dienstweg der MA
	
	public static String getChainOfCommand(Employee employee) {
		String dienstweg = "";
		if (employee.getSuperior() == null) {
			dienstweg += employee.getName() + " " + "[" + employee.getRole() + "]";
			return dienstweg;
		} else {
			dienstweg += employee.getName() + " " + "[" + employee.getRole() + "]" + " -> ";
			return dienstweg + getChainOfCommand(employee.getSuperior());
		}
	}
	
	
	//processHierarchy

	public static String processHierarchy(Employee emp){
		return processHierarchynew(emp, "");
	}
	
	//processHierarchy mit einrückung
	public static String processHierarchynew(Employee emp, String ident) {
		
		if (emp.getSubortinates().isEmpty()) {
			return ident+"- " + emp.getRole() + " [" + emp.getName() + "]\n";
		}
			
		String result = ident+"+ " + emp.getRole() + " (" + emp.getName() + ")\n";
		for (Employee e : emp.getSubortinates()){
			result += ident+processHierarchynew(e,"  ");			
		}		
		return result;	
	}
}
