package com.newpack;

public class Accountant extends Employee{
private String salaryprocessdate;
private boolean approvalTaken;
public String getSalaryprocessdate() {
	return salaryprocessdate;
}
public void setSalaryprocessdate(String salaryprocessdate) {
	this.salaryprocessdate = salaryprocessdate;
}
public boolean isApprovalTaken() {
	return approvalTaken;
}
public void setApprovalTaken(boolean approvalTaken) {
	this.approvalTaken = approvalTaken;
}



public Accountant(int id, String name, String city, String salaryprocessdate, boolean approvalTaken) {
	super(id, name, city);
	this.salaryprocessdate = salaryprocessdate;
	this.approvalTaken = approvalTaken;
}
@Override
public String toString() {
	return "Accountant [salaryprocessdate=" + salaryprocessdate + ", approvalTaken=" + approvalTaken + ", Id="
			+ getId() + ", Name=" + getName() + ", city=" + getCity() + "]";
}



}
