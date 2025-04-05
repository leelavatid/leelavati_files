package org.tnsif.capgemini.c2tc.exceptionhandling;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		String str=null;
		
		try
		{
		System.out.println(str.length());
		}
		catch(NullPointerException m)
		{
		System.out.println(m);
		}
		System.out.println("welcome..");

	}


}
