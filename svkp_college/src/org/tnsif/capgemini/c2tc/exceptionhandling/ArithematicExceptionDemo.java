package org.tnsif.capgemini.c2tc.exceptionhandling;

public class ArithematicExceptionDemo {

	public static void main(String[] args) {
		int numberOne=60/6;
		System.out.println(numberOne); //10
		int numberTwo=90/10;
		System.out.println(numberTwo);//9
		
		try {
			int numberThree=50/0;
			System.out.println(numberThree); 
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		int numberFour=75/25;
		System.out.println(numberFour);//3

	}
}
