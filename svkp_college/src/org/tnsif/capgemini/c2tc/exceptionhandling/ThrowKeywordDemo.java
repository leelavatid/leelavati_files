package org.tnsif.capgemini.c2tc.exceptionhandling;

public class ThrowKeywordDemo {

	void validate(int age) {
		
		if(age<18)
		{
			throw new ArithmeticException("They are not eligible for C2TC Training");
		}
		else
		{
			System.out.println("You are Eligible.");
		}
		}
		
		
		public static void main(String[] args) {
			 ThrowKeywordDemo obj=new  ThrowKeywordDemo();
			 obj.validate(20);
			 System.out.println("welcome C2TC...");

		}

}
