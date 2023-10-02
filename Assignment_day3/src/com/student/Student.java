package com.student;


public class Student {
	int studentId;
	//static int id=550;
	static int studentCount;
	static {
		studentCount=10;
	}
	char studentType;
	
	String studentName; 
	static int getStudentCount() {
		return studentCount;
	}
//Student(){
//	studentCount++;
//	this.studentId=studentCount;
//	
//	
//	
//}

Student(char stype,String fname,String lname){
	
	this.studentId=studentCount;
	this.studentType=stype;
	studentName=fname+lname;
	studentCount++;
}
public void displaydetails(Student s) {
	System.out.println(s.studentId+" "+s.studentName+" "+s.studentType);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student('D',"bony","Thomaas");
		s.displaydetails(s);
		
		Student s2=new Student('H',"Dinil","Bose");
		s.displaydetails(s2);
		

	}

}
