package com.assi2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int day = 4;
//		switch (day) {
//		  case 1:
//		    System.out.println("Monday");
//		    break;
		
		
		String grade="B";
		switch(grade) {
		case "A":
			System.out.println("80-100");
			break;
		case "B":
			System.out.println("73-79");
			break;
		case "C":
			System.out.println("65-72");
			break;
		case "D":
			System.out.println("55-64");
			break;
		case "E":
			System.out.println("<55");
			break;
		default:
			System.out.println("Grade soesnot exists");
		
			
		
		}
	}

}
