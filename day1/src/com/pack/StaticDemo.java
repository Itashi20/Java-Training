package com.pack;

public class StaticDemo {
private static int a=12;
private static int b;

static {
	System.out.println("inside block");
	b=a*12;
}

static void show() {
	System.out.println("outside"+b);
}
}
