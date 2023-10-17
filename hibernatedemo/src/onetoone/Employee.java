package onetoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="emp")
@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int empId;
private String empname;
private String empCity;

@OneToOne(cascade=CascadeType.ALL)
private Laptop laptop;

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



public Laptop getLaptop() {
	return laptop;
}

public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}

public Employee( String empname, String empCity, Laptop laptop) {
	super();
	//this.empId = empId;
	this.empname = empname;
	this.empCity = empCity;
this.laptop = laptop;
}




}
