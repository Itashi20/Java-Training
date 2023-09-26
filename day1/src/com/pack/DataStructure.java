package com.pack;

public class DataStructure {
private final static int SIZE=15;
private int[] arrayOfInt=new int[SIZE];

public DataStructure() {
	for(int i=0;i<SIZE;i++) {
		arrayOfInt[i]=i;
	}
}
	public void printEven() {
		InnerDemo id=new InnerDemo();
		while(id.hasNext()) {
			System.out.println(id.getNext()+" ");
		}
	}
	
	 private class InnerDemo{
		private int next=0;
		public boolean hasNext() {
			return (next<=SIZE-1);
		}
		public int getNext() {
			int retvalue=arrayOfInt[next];
			next+=2;
			return retvalue;
		}
	}
	
}

