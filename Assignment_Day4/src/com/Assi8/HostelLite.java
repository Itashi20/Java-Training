package com.Assi8;



public class HostelLite extends Student {
	private String hostelName;
	private int roomNumber;
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public HostelLite() {
		super();
	}
	public HostelLite(int studentId, char studentType, String studentName, double feesPerMonth, String hostelName,
			int roomNumber) {
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
	public HostelLite(int studentId, char studentType, String studentName, double feesPerMonth) {
		super(studentId, studentType, studentName, feesPerMonth);
	}
	@Override
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println(" " + this.getHostelName() + " " + this.getRoomNumber());
	}
	@Override
	public double calculateFess(double fees) {
		feesPerMonth = fees/6.0;
		feesPerMonth+=1200;
		return feesPerMonth;
	}
}