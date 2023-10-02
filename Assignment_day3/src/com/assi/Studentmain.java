package com.assi;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.setStudentId(5);
		s.setStudentType('B');
		s.setName("Itashi","Pathria");
		System.out.println("ID is : "+s.getStudentId()+"\nType is "+s.getStudentType()+"\nName is: "+s.getName());

		
		Student s2=new Student(2,'C',"Ishita","ABC");
		System.out.println("ID is : "+s2.getStudentId()+"\nType is "+s2.getStudentType()+"\nName is: "+s2.getName());

	}

}
