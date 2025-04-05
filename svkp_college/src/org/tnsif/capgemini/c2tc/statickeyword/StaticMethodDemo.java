package org.tnsif.capgemini.c2tc.statickeyword;
class MathUtils
{
	public static int square(int number)
	{
		return number * number;
	}
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

public class StaticMethodDemo{

	public static void main(String[] args) {
		int result1=MathUtils.square(6);
		 int result2=MathUtils.add(6,4,6);
		 System.out.println("square of number 4: " + result1);
		 System.out.println("add of numbers: " + result2);
	}

}

