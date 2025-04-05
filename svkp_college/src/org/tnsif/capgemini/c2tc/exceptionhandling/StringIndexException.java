package org.tnsif.capgemini.c2tc.exceptionhandling;

public class StringIndexException {

	public static void main(String[] args) {
		String str="hello leela"; //0-10
	try
	{
		char chr	=str.charAt(12);
		System.out.println(chr);
	}
	catch(StringIndexOutOfBoundsException m)
	{
		System.out.println(m);
	}
	finally
	{
		System.out.println("this block will get executed regardless of exception.");
	}

	}


}
