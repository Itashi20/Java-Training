package com.assi2;

public class Hostelite extends Student {
String hostelName;
int roomNumber;
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
public Hostelite() {
	super();
	// TODO Auto-generated constructor stub
}
//public Hostelite(int studentId, char studentType, String fname, String lname) {
//	super(studentId, studentType, fname, lname);
//	// TODO Auto-generated constructor stub
//}

public Hostelite(int studentId,char studentType, String studentFirstName, String studentLastName,String hostelName, int roomNumber, double feesPerMonth) {
	super(studentId,studentType, studentFirstName, studentLastName,feesPerMonth);
	// TODO Auto-generated constructor stub
	//super.setFeesPerMonth(feesPerMonth);
	this.hostelName = hostelName;
	this.roomNumber = roomNumber;
}

}
