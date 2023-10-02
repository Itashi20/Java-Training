package com.assi5;

public class Main {
	public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(5,"ABC",45, 160,'B',"Manu","XYZ");

        System.out.println(dayScholar.calculateFees());
        System.out.println(dayScholar.getFees());
    }
}

