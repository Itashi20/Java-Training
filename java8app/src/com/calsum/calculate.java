package com.calsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calculate {
	
	public static int sumNumbers(List<Integer>numbers){
	    int sum = 0;
	    for(int i = 0; i<numbers.size(); i++){
	    	if(numbers.get(i)>10) {
	        sum+=numbers.get(i);}
	    	else
	    		continue;
	   }
	    return sum;
	}
	
	public static int sumdata2(ArrayList<Integer>list) {
		return list.stream().filter(i->i>10).mapToInt(i->i).sum();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> al = new ArrayList<Integer>(); // works fine 
//		calculate c=new calculate();
//		
//		
//		c.sumNumbers();
		System.out.println(sumdata2(new  ArrayList<Integer>(Arrays.asList(2,20,89,45,89))));
		System.out.println(sumNumbers(new  ArrayList<Integer>(Arrays.asList(2,20,89,45,89))));

	}

}
