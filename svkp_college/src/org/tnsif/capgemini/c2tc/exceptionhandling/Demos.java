package org.tnsif.capgemini.c2tc.exceptionhandling;

public class Demos {
	public static void main(String[] args) {
		int a=100;
		int b=200;
		int sum=add(a,b);
		
		System.out.println(sum);
	}
	public static int add(int a,int b)
	{
		return a-b;
	}

}
