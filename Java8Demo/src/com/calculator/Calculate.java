package com.calculator;

public class Calculate {

    interface operate {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, operate op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {
    
        Calculate c = new Calculate();
        operate addition = (a, b) -> a + b;
        operate subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
            c.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            c.operateBinary(20, 10, subtraction));    
    }
}