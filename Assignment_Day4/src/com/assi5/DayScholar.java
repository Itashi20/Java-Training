package com.assi5;

public class DayScholar extends PostGradStudent {
	private String residentialAddress;
public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
public DayScholar(int postCourseId, String postCourseName, int postCoursefees, int StudentId, char StudentType,
			String StudentName,String ra) {
		super(postCourseId, postCourseName, postCoursefees, StudentId, StudentType, StudentName);
		this.residentialAddress=ra;
		// TODO Auto-generated constructor stub
	}
public int calculateFees() {
    return this.getPostCoursefees()/6;
}

public int getFees() {
    return this.calculateFees();
}







}
