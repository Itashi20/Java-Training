package com.Assi7;

public class Student {
int studentId;
char studentType;
String studentName;
String residentialStatus;
double feesPerMonth;
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
public String getResidentialStatus() {
	return residentialStatus;
}
public void setResidentialStatus(String residentialStatus) {
	this.residentialStatus = residentialStatus;
}
public double getFeesPerMonth() {
	return feesPerMonth;
}
public void setFeesPerMonth(double feesPerMonth) {
	this.feesPerMonth = feesPerMonth;
}
public Student(int studentId, String studentFirstName, String studentLastName, char studentType) {
	super();
	this.studentId = studentId;
	this.studentName = studentFirstName+" "+studentLastName;
	this.studentType = studentType;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

void calculateFees(double semFees) {
	this.setFeesPerMonth(semFees/6.0);
}

void calculateFees(double semFees,double hostelFees) {
	this.setFeesPerMonth(hostelFees+semFees/6.0);
}




 

}
