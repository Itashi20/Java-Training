package com.newpack;

public class Manager extends Employee {
private int noofEmp;
public int getNoofEmp() {
	return noofEmp;
}
public void setNoofEmp(int noofEmp) {
	this.noofEmp = noofEmp;
}
public int getHRA() {
	return HRA;
}
public void setHRA(int hRA) {
	HRA = hRA;
}
private int HRA;

public Manager(int id, String name, String city, int noofEmp, int hRA) {
	super(id, name, city);
	this.noofEmp = noofEmp;
	HRA = hRA;
}
@Override
public String toString() {
	return "Manager [noofEmp=" + noofEmp + ", HRA=" + HRA + ", Id()=" + getId() + ", getName()=" + getName()
			+ ", getCity()=" + getCity() + "]";
}





}
