package com.inter;

public class interMain {
public static void main(String args[]) {
	interface1 in=new interimpl();
	interface2 in2=new interimpl();
	in.addUser();
	in2.createUser();
	
	in.showUser();
	in2.showUser();
	
}
}
