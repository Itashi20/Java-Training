package registrationPack;

import studentpack.Student;

public class DayScholar extends Student {
	private String residentialAddress; 
	public void setResAddress(String resAddress){ 
		this.residentialAddress=resAddress ; 
	}
	public void getDetails(){ 
		System.out.println("Student Id:"+getStudentId()); 
		System.out.println("Student Type:"+getStudentType()); 
		System.out.println("Student Name:"+getStudentName()); 
	}
}