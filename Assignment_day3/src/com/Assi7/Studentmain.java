package com.Assi7;

import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the student ID");
//		int id = sc.nextInt();
//		System.out.println("Enter the student name");
//		String name=sc.nextLine();
//		
//		System.out.println("Enter the residential Ststus");
//		String status=sc.nextLine();
//		System.out.println("enter the fees");
//		int fee=sc.nextInt();
//		
		
//		Student s=new Student();
//		s.setStudentId(Integer.parseInt(args[0]));
//		s.setStudentName(args[1]);
//		s.setResidentialStatus(args[2]);
//		s.setFeesPerMonth(Integer.parseInt(args[3]));
//		
//		
//		
//		System.out.println("ID is : "+s.getStudentId()+"\nName is "+s.getStudentName()+"\nFees is: "+s.getFeesPerMonth()+"\nStatus is: "+s.getResidentialStatus());

		
		Student student = new Student(101,"Itashi","Pathria",'A');
		student.setResidentialStatus("Day Scholar");
		
		if(student.getResidentialStatus().equalsIgnoreCase("Day scholar")) {
			student.calculateFees(100000, 50000);
		}else {
			student.calculateFees(100000);
		}
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getResidentialStatus());
		System.out.println(student.getFeesPerMonth());
	
		
		
		
		
		

	}

}
