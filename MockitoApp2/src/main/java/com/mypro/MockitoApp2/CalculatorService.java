package com.mypro.MockitoApp2;

public class CalculatorService {
	//inject -->dependency injection
	

private AddService service;

public CalculatorService(AddService service) {
	super();
	this.service = service;
}

public int calc(int a,int b) {
	return service.add(a, b);
	
}

public int multi(int a,int b) {
	return service.multiply(a, b);
	
}

public int div(int a,int b) {
	return service.divide(a, b);
	
}

}
