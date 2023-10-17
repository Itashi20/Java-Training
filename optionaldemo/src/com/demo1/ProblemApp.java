package com.demo1;

import java.util.ArrayList;
import java.util.List;

public class ProblemApp {
public static List<Employee>createEmployee(){
	List<Employee>emplist=new ArrayList<Employee>();
	emplist.add(new Employee("John","NewYork",30));
	emplist.add(new Employee("SAM","London",40));
	emplist.add(new Employee("Shanaya","USA",50));
	return emplist;
}

public static Employee searchEmployee(List<Employee>employeeList,String name) {
	for(Employee em:employeeList) {
		if(em.getName().equalsIgnoreCase(name)) {
			return em;
		}
	}
	return null;
}



public static void main(String args[]) {
	List<Employee>empList=createEmployee();
	Employee employee=searchEmployee(empList,"John1");
	System.out.println("Employee:"+employee.getName()+"found....");
	
	
	
}

//Null pointter exception-->if we use john1 which doesnot exist so it will throw null pointer exception and so to handle this we use the concept of optional 

}
