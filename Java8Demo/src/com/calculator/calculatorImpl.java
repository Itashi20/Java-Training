package com.calculator;

//import com.fi.Worker;


public class calculatorImpl {
//	public static void execute(calculator c) {
//		c.Add();
//	}
//	public static void main(String[] args) {
//	execute(()->System.out.println(5+6));
//}
	public int operate(int a, int b, calculator op) {
	    return op.operate(a, b);
	}
	calculatorImpl c = new calculatorImpl();
	calculator addition =((a,b)->a+b);
  // System.out.println(c.operate)
    //System.out.println(c.operate(40, 2,addition));

    //calculator addition = (a, b) -> a+b ;
   // calculator subtraction =(a, b)-> a-b;
   // System.out.println("40 + 2 = " + c.operate(40, 2, addition));
    //System.out.println("20 - 10 = " +c.operate(20, 10, subtraction));
}