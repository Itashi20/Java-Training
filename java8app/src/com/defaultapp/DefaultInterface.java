package com.defaultapp;

public interface DefaultInterface {

	public void addUser();
	public default void showUser() {
		System.out.println("demo");
	}
	
	public static void showUser2() {
		System.out.println("demoshow user2");
	}
}
