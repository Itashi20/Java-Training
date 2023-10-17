package com.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>p1=Arrays.asList(10,20,40);
		List<Integer>p2=Arrays.asList(50,60,30);
		List<Integer>p3=Arrays.asList(90,30,44);
		
		
		List<List<Integer>> ap=new ArrayList<List<Integer>>();
		ap.add(p1);
		ap.add(p2);
		ap.add(p3);
		List<Integer>fltmap=ap.stream().flatMap(i->i.stream())
				.collect(Collectors.toList());
	System.out.println(fltmap);

	}

}
