package com.assi2;

public class UserType {
	String name;
	
	UserType(String para){
		name=para;
	}
	
	UserType(){
		this("student");
	}
	
	public static void main(String args[]) {
		UserType us1=new UserType("ABC");
		UserType us2=new UserType();
		
		System.out.println(us1.name);
		System.out.println(us2.name);
	}
	
}
