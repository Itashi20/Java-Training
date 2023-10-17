package com.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int laptopid;
private String laptopName;
public int getLaptopid() {
	return laptopid;
}
public void setLaptopid(int laptopid) {
	this.laptopid = laptopid;
}
public String getLaptopName() {
	return laptopName;
}
public void setLaptopName(String laptopName) {
	this.laptopName = laptopName;
}
@Override
public String toString() {
	return "Laptop [laptopid=" + laptopid + ", laptopName=" + laptopName + "]";
}
public Laptop(String laptopName) {
	super();
	//this.laptopid = laptopid;
	this.laptopName = laptopName;
}
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}



}
