package com.client;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContext;
import onetooneSemester.Semester;
import onetooneSemester.Student;

public class ClientSemester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//

		Session session = HibernateContext.getSession();
		Transaction tx = session.beginTransaction();
//		Laptop laptop=new Laptop("HP","10000");
//		Employee employee=new Employee("sarath","Chennai",laptop);
		
		Semester sem=new Semester(30.6,34);
		Student stu=new Student("Itashi","A",sem);
		session.save(stu);
		tx.commit();
		System.out.println("Username saved");
	}

}
