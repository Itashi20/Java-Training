package com.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProblemApp {
public static List<Employee>createEmployee(){
	List<Employee>emplist=new ArrayList<Employee>();
	emplist.add(new Employee("John","NewYork",30));
	emplist.add(new Employee("SAM","London",40));
	emplist.add(new Employee("Shanaya","USA",50));
	return emplist;
}

public static Optional <Employee >searchEmployee(List<Employee>employeeList,String name) {
//	for(Employee em:employeeList) {
//		if(em.getName().equalsIgnoreCase(name)) {
//			return em;
//		}
//	}
//	return null;
	
	for(Employee em:employeeList) {
		if(em.getName().equalsIgnoreCase(name)) {
			return Optional.of(em);
		}
	}
	return Optional.empty();
}



public static void main(String args[]) {
	List<Employee>empList=createEmployee();
	Optional<Employee> employee=searchEmployee(empList,"John");
	//System.out.println("Employee:"+employee.getName()+"found....");
	
	if(employee.isPresent()) {
		Employee emp=employee.get();
		System.out.println("Employee"+emp.getName());
	}
	else {
		System.out.println("Employee Not Found");
	}
	
}

//Null pointter exception-->if we use john1 which doesnot exist so it will throw null pointer exception and so to handle this we use the concept of optional 

}
