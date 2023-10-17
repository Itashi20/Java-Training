package com.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.context.HibernateContext;
import com.entity.Employee;

public class Client1 {

	public static void main(String[] args) {
		Session session = HibernateContext.getSession();
		
Employee em=(Employee)session.get(Employee.class, 3);
Employee em2=(Employee)session.get(Employee.class, 3);
		System.out.println(em);
		System.out.println(em2);
		System.out.println("Username saved");
	}

}
