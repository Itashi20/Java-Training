package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int rollno;
private String name;
private String studentClass;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStudentClass() {
	return studentClass;
}
public void setStudentClass(String studentClass) {
	this.studentClass = studentClass;
}
public Student(int rollno, String name, String studentClass) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.studentClass = studentClass;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", studentClass=" + studentClass + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
