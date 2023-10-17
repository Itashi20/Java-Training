package com.mypro.MockitoApp2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalcTest {
	@Mock
	AddService addService;
	
	CalculatorService calculatorService;
	
	//prioritization 1)before each will call 2)test will be called
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	void testCalc() {
		
		
		//addService=Mockito.mock(AddService.class);
		
		//we are giving mocked object copy o fit
		calculatorService=new CalculatorService(addService);
		int dat1=5;
		int dat2=10;
		int expected=15;
		int expected2=50;
		int expected3=2;
		//only when then use static import
		Mockito.when(addService.add(dat1, dat2)).thenReturn(expected);  //23
		Mockito.when(addService.multiply(dat1, dat2)).thenReturn(expected2);
		Mockito.when(addService.divide(dat1, dat2)).thenReturn(expected3);
		
		int actual=calculatorService.calc(dat1, dat2);  //23
		
		int actual2=calculatorService.multi(dat1, dat2);
		int actual3=calculatorService.div(dat1, dat2);


		assertEquals(expected, actual);
		System.out.println("Successful");
		
		assertEquals(expected2, actual2);
		System.out.println("Successful");
		
		assertEquals(expected3, actual3);
		System.out.println("Successful");
		
	}
	
}
