package com.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

//import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.Timeout;
//import org.junit.jupiter.api.Test;


public class CalculatorTest {
	//int a=10;
	//@Rule
	CountDownLatch gt=new CountDownLatch(1);
	
	//countdownlatch the no of people who are starting has to reach finishing line..we need to wait
	//takes value countdown--->job will begin
	@Rule
	public Timeout tout=Timeout.seconds(50);
	public static String log;
	@Test(timeout=5000)
	public void testone() throws InterruptedException {
		log+="r-1";
		//TimeUnit.SECONDS.sleep(10);
		
	}
	
	@Test
	public void testTwo() throws Exception {
		log+="r-2";
		gt.await();
		//thread is not coming  its in awaiting stage .
	}
	
	static Calculator cal;

	//objects declaring for single time 
	//beforeeach
	@BeforeClass
	public static void callBeforeClass() {
		System.out.println("called once");
		cal=new Calculator();
		
	}
	@Before
	//beforeeach
	public void callBefore() {
		
//		System.out.println(a);
//		System.out.println(++a);
		
		//System.out.println("call before Test");
		//cal=new Calculator();
		System.out.println("called everytime");
	}
	@After
	//after
	public void callAfter() {
		System.out.println("called After Test");
	}
	@Test
	//@Timeout(unit=TimeUnit.MILLISECONDS,value=1000)
	@Ignore
	public void testAdd() throws InterruptedException {
	assertEquals(10,cal.calculateAdd(5, 5));
	}
    
	@Test(timeout=1000)
	@Ignore
	//@Timeout(unit=TimeUnit.MILLISECONDS,value=1000)
	public void testmultiply() {
		try {
		Thread.sleep(2000);}
		catch(Exception e) {
			
		}
		assertEquals(25,cal.calculateMultiply(5,5));
		
	}
}
