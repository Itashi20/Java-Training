package com.student2;

public class StudentNew {
int studentId;
char studentType;
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
public StudentNew() {
	//super();
	this.studentId=10;
	this.studentType='F';
}
//public StudentNew(int studentId, char studentType) {
//	super();
//	this.studentId = studentId;
//	this.studentType = studentType;
//}


}
