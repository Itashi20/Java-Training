package com.assi5;

public class Student {
private static int currentId;
private int studentId;
private char studentType;
private String studentName;
public Student(int studentId, char studentType, String studentName) {
	super();
	this.studentId = studentId;
	this.studentType = studentType;
	this.studentName = studentName;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
	this.studentId=++currentId;
	
	
	
}





}
