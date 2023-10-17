package com.io;

import java.io.Serializable;

public class Student implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int stuId;
private String stuName;
private String email;
private transient String city;

public int getStuId() {
	return stuId;
}
@Override
public String toString() {
	return "Student [stuId=" + stuId + ", stuName=" + stuName + ", email=" + email + ", city=" + city + "]";
}
public Student(int stuId, String stuName, String email, String city) {
	super();
	this.stuId = stuId;
	this.stuName = stuName;
	this.email = email;
	this.city = city;
}
public void setStuId(int stuId) {
	this.stuId = stuId;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
