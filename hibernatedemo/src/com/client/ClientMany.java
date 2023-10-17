package com.client;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContext;

import onetomany.Employee;
import onetomany.Laptop;

public class ClientMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session= HibernateContext.getSession();
		Transaction tx=session.beginTransaction();
		
		Laptop laptop=new Laptop("HP","10000");
		Laptop laptop2=new Laptop("Lenovo","30000");
		
		ArrayList<Laptop>al=new ArrayList<>();
		al.add(laptop);
		al.add(laptop2);
		Employee employee=new Employee("Itashi","Ptk",al);
		session.save(employee);
		tx.commit();
	}

}
