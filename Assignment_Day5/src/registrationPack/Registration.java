package registrationPack;

class Registration{ 
	public static void main (String args[]){ 
		DayScholar dayScholar=new DayScholar(); 
		dayScholar.setStudentId(1001); 
		dayScholar.setStudentType('A'); 
		dayScholar.setStudentName("Itashi"); 
		dayScholar.getDetails(); 
	}
} 
