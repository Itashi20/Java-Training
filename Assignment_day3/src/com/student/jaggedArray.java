package com.student;

public class jaggedArray {

	public static void main(String[] args) {
		 String arr[][] = {{"Tony","JAVA","C","C++"},{"Thomas","JAVA","C"},{"Daniel","JAVA","C","C++"}};
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++)
	                System.out.print(arr[i][j]+" ");
	            System.out.println();
	        }	
	}
}
