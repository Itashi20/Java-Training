package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Emp")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="empid")
private int empId;
private String empName;
private String empCity;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpCity() {
	return empCity;
}
public void setEmpCity(String empCity) {
	this.empCity = empCity;
}
public Employee(int empId, String empName, String empCity) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empCity = empCity;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + "]";
}


}
