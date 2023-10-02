package studentpack;


public class Student {
	private int studentId; 
	private char studentType; 
	protected String studentName; 

	public int getStudentId() {
		return studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentId(int sId) { 
		this.studentId=sId; 
	}
	public void setStudentType(char sType){ 
		this.studentType=sType; 
	}
	public void setStudentName(String sName){ 
		this.studentName=sName;
	}
}