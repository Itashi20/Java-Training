package com.student3;

public class StudentAssi {
	int studentId;
	static int id=550;
	char studentType;
	
	String studentName; 
	
StudentAssi(){
	this.studentId=id;
	id++;
	
}

StudentAssi(char stype,String fname,String lname){
	this.studentId=id;
	this.studentType=stype;
	studentName=fname+lname;
	id++;
}
public void displaydetails(StudentAssi s) {
	System.out.println(s.studentId+" "+s.studentName+" "+s.studentType);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentAssi s=new StudentAssi('D',"bony","Thomaas");
		s.displaydetails(s);
		
		StudentAssi s2=new StudentAssi('H',"Dinil","Bose");
		s.displaydetails(s2);
		

	}

}
