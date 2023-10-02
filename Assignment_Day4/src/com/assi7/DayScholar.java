package com.assi7;

public class DayScholar extends Student {
String residentialAddress;

public String getResidentialAddress() {
	return residentialAddress;
}

public void setResidentialAddress(String residentialAddress) {
	this.residentialAddress = residentialAddress;
}

public DayScholar(int studentId, char studentType, String studentName, double feesPerMonth, String residentialAddress) {
	super(studentId, studentType, studentName, feesPerMonth);
	this.residentialAddress = residentialAddress;
}
public void displayDaySDetails() {
	System.out.println(this.studentId + " " + this.studentName + " " + this.studentType + " " + this.feesPerMonth + " "
			+ this.residentialAddress);
}


}
