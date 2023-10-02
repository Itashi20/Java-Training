package com.assi6;

public class DayScholar extends Student {
	private String residentialAddress;

	public void setResAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}

	public void getDetails() {
		super.getDetails();
		System.out.println("Student Name " + studentName);
		System.out.println("Residential Address" + residentialAddress);
	}
}