package com.inter;

public interface interface1 {
	public void addUser();
	public default void showUser() {
		System.out.println("User in interface1");
	}
}
