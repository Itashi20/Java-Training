package com.client;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.context.HibernateContext;
import com.entity.Employee;

public class FetchUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateContext.getSession();
		//Query query=session.createQuery("select e from Employee e");
		Query query=session.createQuery("from Employee");
		//hql-->object name  hibernate query language
		//no need of transaction in retrieval
		
		List<Employee>lst=query.list();
		//System.out.println(query);
		for(Employee emp:lst){
			System.out.println(emp);
		}
		
		
	}

}
