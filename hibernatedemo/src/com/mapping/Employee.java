package com.mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int empid;
private int empname;
private String empcity;



@OneToMany(cascade=CascadeType.ALL)
@JoinColumn
private List <Address> address;

@OneToOne(cascade=CascadeType.ALL)
private Laptop laptop;

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public int getEmpname() {
	return empname;
}

public void setEmpname(int empname) {
	this.empname = empname;
}

public String getEmpcity() {
	return empcity;
}

public void setEmpcity(String empcity) {
	this.empcity = empcity;
}

public List<Address> getAddress() {
	return address;
}

public void setAddress(List<Address> address) {
	this.address = address;
}

public Laptop getLaptop() {
	return laptop;
}

public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}

public Employee(int empname, String empcity, List<Address> address, Laptop laptop) {
	super();
	//this.empid = empid;
	this.empname = empname;
	this.empcity = empcity;
	this.address = address;
	this.laptop = laptop;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}




}
