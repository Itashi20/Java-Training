package com.app;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//advantage there are some parameters available 
@RunWith(Parameterized.class)
public class ParamtrTest {
	
	public int m1;
	public int m2;
	public ParamtrTest(int m1, int m2) {
		super();
		this.m1 = m1;
		this.m2 = m2;
	}
@Parameters	
//from org.junit we neeed to take get called based on number of values in the array
	public static Collection<Object[]>userData(){
		//array of different parameters
		//array of datasupply forEach
		Object[][] data=new Object[][] {{1,2},{5,3},{121,4}};
		return Arrays.asList(data);
		}
	
	@Test
	public void testMulti() {
		Calculator c=new Calculator();
		assertEquals(m1*m2,c.calculateMultiply(m1, m2));
		
	}
	
	@Test
	public void testAdd() throws InterruptedException {
		Calculator c=new Calculator();
		assertEquals(m1+m2,c.calculateAdd(m1, m2));
		
		
	}

	private void assertEquals(int i, int calculateMultiply) {
		// TODO Auto-generated method stub
		
	}

}
