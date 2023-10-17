package com.client;

import org.hibernate.Session;

import com.context.HibernateContext;
import com.entity.Employee;

public class LoadSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateContext.getSession();
		Employee em=(Employee)session.get(Employee.class, 1);
		
		System.out.println(em);

	}

}
