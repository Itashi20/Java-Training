package com.client;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContext;
import com.mapping.Address;
import com.mapping.Employee;
import com.mapping.Laptop;

public class ClientMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session session=HibernateContext.getSession();
Transaction tx=session.beginTransaction();

Laptop laptop=new Laptop("HP");

ArrayList<Address> address=new ArrayList<>();

address.add(new Address("Ptk","Punjab"));
address.add(new Address("ABC","XYZ"));


Employee emp=new Employee(123,"Blr",address,laptop);

session.save(emp);
tx.commit();
System.out.println("Infpormation is saved successsfully");



	}

}
