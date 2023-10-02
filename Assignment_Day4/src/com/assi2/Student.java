package com.assi2;

public class Student {
protected int studentId;
protected char studentType;
protected String studentName;
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
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public double getFeesPerMonth() {
	return feesPerMonth;
}
public void setFeesPerMonth(double feesPerMonth) {
	this.feesPerMonth = feesPerMonth;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studentId, char studentType, String fname,String lname,double feesPerMonth) {
	super();
	this.studentId = studentId;
	this.studentType = studentType;
	this.studentName =fname+lname;
	this.feesPerMonth = feesPerMonth;
}

}

