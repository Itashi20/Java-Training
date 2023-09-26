package com.pack;

public class EmployeeMain {
public static void main(String args[]) {
	Employee emp=new Employee();
	emp.setEmpId(101);
	emp.setEmpName("Itashi");
	emp.setEmpCity("Mumbai");
	
    System.out.println(emp.getEmpName()+" "+emp.getEmpCity());
    
    
    Employee emp2=new Employee(123,"admin","chennai");
    System.out.println(emp2);
    System.out.println(emp2.hashCode());
}
}



