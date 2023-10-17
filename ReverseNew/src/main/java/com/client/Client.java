package com.client;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContext;
import com.entity.Emp;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//

		Session session = HibernateContext.getSession();
		Transaction tx = session.beginTransaction();
     Emp emp = new Emp(109, "useer-1", "Delhi");
	session.save(emp);
//		Student stu=new Student(1,"Itashi","ABC");
//		session.save(stu);
		//tx.commit();
		System.out.println("Username saved");
	}

}
