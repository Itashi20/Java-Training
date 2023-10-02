package com.assi;

public class Student 
{
int studentId;
char studentType;
String name;

public Student() {
	//super();
	this.studentId=10;
	this.studentType='F';
}

public Student(int id,char type,String fname,String lname) {
	this.studentId=id;
	this.studentType=type;
	this.name=fname+lname;
}

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

public String getName() {
	return name;
}

public void setName(String fname,String lname) {
	this.name = fname+lname;
}



//public StudentNew(int studentId, char studentType) {
//	super();
//	this.studentId = studentId;
//	this.studentType = studentType;
//}


}

