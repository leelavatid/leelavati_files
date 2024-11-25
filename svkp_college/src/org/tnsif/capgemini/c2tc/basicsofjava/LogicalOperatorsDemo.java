package org.tnsif.capgemini.c2tc.basicsofjava;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		System.out.println("The result of (a<b&&b>c) is: "+((a<b)&&(b>c)));//F
		System.out.println("The result of (a<b||a>c) is: "+((a<b)||(a>c)));//T
         System.out.println("The result of (!(a>c)) is: "+!(a>c));//T
	}

}
