package com.assi3;

public class DayScholar extends Student{
String residentialAddress;

public String getResidentialAddress() {
	return residentialAddress;
}

public void setResidentialAddress(String residentialAddress) {
	this.residentialAddress = residentialAddress;
}

public DayScholar(String residentialAddress) {
	super();
	this.residentialAddress = residentialAddress;
}

public DayScholar() {
	super();
	// TODO Auto-generated constructor stub
}

public DayScholar(int studentId, char studentType, String fname, String lname,String ra, double feesPerMonth) {
	super(studentId, studentType, fname, lname, feesPerMonth);
	this.residentialAddress=ra;
	
	// TODO Auto-generated constructor stub
}

public void displayStudentDetails() {
	super.displayStudentDetails();
  System.out.println(this.getResidentialAddress());
}

}
