package com.taskschooloptional;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo2.Camera;
import com.demo2.Displayfeatures;
import com.demo2.MobileServiceStation;
import com.demo2.ScreenResol;
import com.demo2.SmartPhone;
import com.taskschooloptional.gradings.Grade;

public class Organizermain implements SchoolDAO {

//	public Optional<Exams> getgrade(Optional<School>school) {
//		return school.flatMap(School::getExams)
//				.flatMap(Exams::getStudent)
//			        .forEach(this::invoke)
//				.map(Students::getGradings)
//				.orElse(0);
//		
//	}
	
	
	@Override
	public void showData(Optional<School> school) {
		// TODO Auto-generated method stub
//	System.out.println(school.flatMap(School::getExams)
//				.map(Exams::getStudent));
	
	
	
//	System.out.println(school.flatMap(School::getExams)
//			.map(Exams::getStudent).forEach(i->i.get()) );
//	
		
		
		school.flatMap(School::getExams)
		.map(Exams::getStudent).get()	
		.forEach(s->System.out.println("Student ID: "+s.get().getId()
				+"\nStudent Name: "+s.get().getName()+"\nGrades: "+"\nShuttle: "+s.get().getShuttle().get()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	
	//making objects and calling

	shuttle s=new shuttle("blr",78,90);
//	Students student=new Students(1,"Itashi",Optional.of(grade),Optional.of(s));
//	Exams exam=new Exams("Final Terminal","English",IsoChronology.INSTANCE.date(1980, 6, 20),Optional.of(student));
//	
//	
	
   //ArrayList <Students> st=new ArrayList<Students>();
	List<Optional<Students>> st = new ArrayList();
	Students st1=new Students(11,"Itashi",gradings.Grade.A,Optional.of(s));
	Students st2=new Students(12,"ABC",gradings.Grade.B,Optional.of(s));
	Students st3=new Students(13,"XYZ",gradings.Grade.C,Optional.of(s));
	Students st4=new Students(14,"MNO",gradings.Grade.D,Optional.of(s));
	
	st.add(Optional.of(st1));
	st.add(Optional.of(st2));
	st.add(Optional.of(st3));
	st.add(Optional.of(st4));
//	st.add(st2);
//	st.add(st3);
//	st.add(st4);
 Exams exam=new Exams("Final Terminal","English",IsoChronology.INSTANCE.date(1980, 6, 20),st);
 School sc=new School("ABC","Punjab",Optional.of(exam));
  Organizermain org=new Organizermain();
org.showData(Optional.of(sc));

	
	}
	


}
