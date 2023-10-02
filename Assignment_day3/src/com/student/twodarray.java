package com.student;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstArray[][]= {{1,1,1,},{1,1,1}};
		int secondArray[][]= {{2,2,2},{2,2,2}};
		int sum[][]=new int[2][3];
		
      for(int i=0;i<2;i++) {
    	  for(int j=0;j<3;j++) {
    		 sum[i][j]=firstArray[i][j]+secondArray[i][j];
    	  }
      }
      
      for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sum[i][j]); 
			}
			System.out.println();
		}
	}

}
