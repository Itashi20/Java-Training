package com.assignment;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int intVal=10;
float floatVal=3.0f;
boolean bool1=true;
boolean bool2=false;
boolean boool3=true;


//Arithmetic :Modulus operator
System.out.println("Arithmetic");
System.out.println(intVal+"%"+floatVal+"="+(intVal%floatVal));
System.out.println();

//Concatenation
System.out.println("String Concatenation");
System.out.println("day"+2+"Session");
System.out.println("\n"+2+3+"\n"+(2+3));
System.out.println();

//Relational:Equality operator
System.out.println("Relational");
System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));

floatVal=10.0f;  //implicit conversion in comparsion
System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));

System.out.println();

bool2=false;
if(bool1 ||(bool1 &&(bool2==false))) {
	System.out.println("Success");
}
else
{
	System.out.println("failure");
	
	
}

System.out.println("bool2 value:"+bool2);

	}

}
