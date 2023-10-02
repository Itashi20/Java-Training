package com.assi7;

public class Student {
protected int studentId;
protected char studentType;
protected String studentName;
private final int semesterFees=12000;
protected double feesPerMonth;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public char getStudentType() {
	return studentType;
}
public void setStudentType(char studentType) {
	this.studentType = studentType;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String fname,String lname) {
	this.studentName = fname+lname;
}


public Student(int studentId, char studentType, String studentName, double feesPerMonth) {
	super();
	this.studentId = studentId;
	this.studentType = studentType;
	this.studentName = studentName;
	this.feesPerMonth = feesPerMonth;
}
public void displayDetail()
{
	System.out.println(this.getStudentId());
	System.out.println(this.getStudentType());
	System.out.println(this.getStudentName());
}

public void calculateFees() {
	this.feesPerMonth=semesterFees/6.0;
	System.out.println(this.feesPerMonth);
}


}
