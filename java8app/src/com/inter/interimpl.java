package com.inter;

public class interimpl implements interface1,interface2 {

	@Override
	public void createUser() {
		// TODO Auto-generated method stub
		System.out.println("user is created successfully");
		
	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("user is added successfully");
		
	}

	@Override
	public void showUser() {
		// TODO Auto-generated method stub
		interface1.super.showUser();
	}

}
