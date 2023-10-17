package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import onetomany.Laptop;
@Entity
@Table(name="emp")
public class Employee {
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="empid")
private int empId;
private String empname;
private String empCity;

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn
private List<Laptop> laptop;

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public String getEmpCity() {
	return empCity;
}

public void setEmpCity(String empCity) {
	this.empCity = empCity;
}

public List<Laptop> getLaptop() {
	return laptop;
}

public void setLaptop(ArrayList<Laptop> laptop) {
	this.laptop = laptop;
}

public Employee(String empname, String empCity, List<Laptop> al) {
	super();
	//this.empId = empId;
	this.empname = empname;
	this.empCity = empCity;
	this.laptop = al;
}







}
