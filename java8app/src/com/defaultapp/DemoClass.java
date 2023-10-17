package com.defaultapp;

public class DemoClass implements DefaultInterface {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("user added");
		
	}
	//this function is overrrided
	@Override
	public void showUser() {
		System.out.println("demooverrided");
	}
	
	//static method cannot be overriden
	public void showUser2() {
		System.out.println("static method demooverrided");
	}

}
