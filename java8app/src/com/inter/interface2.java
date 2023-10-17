package com.inter;

public interface interface2 {
	public void createUser();
	public default void showUser() {
		System.out.println("User in interface2");
	}
}
