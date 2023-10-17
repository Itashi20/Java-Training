package com.client;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContext;


import onetoone.Employee;
import onetoone.Laptop;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//

		Session session = HibernateContext.getSession();
		Transaction tx = session.beginTransaction();
//Employee emp = new Employee(102, "useer-1", "Delhi");
	//session.save(emp);
//		Student stu=new Student(1,"Itashi","ABC");
//		session.save(stu);
	//	tx.commit();
//Employee em=(Employee)session.get(Employee.class, 2);
		
		//System.out.println(em);
		Laptop laptop=new Laptop("HP","10000");
		Employee employee=new Employee("sarath","Chennai",laptop);
		session.save(employee);
		tx.commit();
		System.out.println("Username saved");
	}

}
