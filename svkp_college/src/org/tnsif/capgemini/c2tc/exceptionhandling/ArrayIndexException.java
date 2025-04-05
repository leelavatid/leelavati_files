package org.tnsif.capgemini.c2tc.exceptionhandling;

public class ArrayIndexException {

	public static void main(String[] args) {
		int arr[]=new int[5]; //5 elements //0-4
		try
		{
			int i=arr[8];
			  System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException p)
		{
			System.out.println(p);
		}
		finally
		{
			System.out.println("whatever happen this line gets executed always.");
		}
		  
	}

}
