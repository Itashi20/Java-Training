package com.assi1;

public class Student {
	protected int studentId; 
	protected char studentType; 
	protected String studentName; 
	public void setStudentId(int sId){ 
		this.studentId=sId; 
	}
	public void setStudentType(char sType){ 
		this.studentType=sType; 
	}
	public void setStudentName (String sName) { 
		this.studentName=sName ; 
	}
	public void getDetails(){ 
		System.out.println("Student ID :"+this.studentId);
		System.out.println("Student Type :"+this.studentType);
		System.out.println("Student Name :"+this.studentName);
	}
}
