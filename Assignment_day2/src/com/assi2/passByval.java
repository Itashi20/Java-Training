package com.assi2;

import com.student.Student;

public class passByval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sid=25;
		passByval val=new passByval();
		System.out.println(sid);
		val.passTheValueMethod(sid);
		System.out.println(sid);
		
		Student stu=new Student();
		System.out.println(stu.getStudentId());
		val.passTheValueStudent(stu);
		System.out.println(stu.studentId);
	}
	public void passTheValueMethod(int sid) {
		
		sid=10;
		System.out.println(sid);
	}
	public void passTheValueStudent(Student sid) {
		sid.studentId=10;
		System.out.println(sid.studentId);
	}

}
