package org.tnsif.capgemini.c2tc.basicsofjava;

public class BitwiseOperatorsDemo {

	public static void main(String[] args) {
		int a=2,b=3;
		//bitwiseAND
		System.out.println("The value of (a&b): "+(a&b));//0010&0011=0010=2
		//bitwiseOR
		System.out.println("The value of (a|b): "+(a|b));//0010|0011=0011=3
		//bitwiseXOR
		System.out.println("The value of (a^b): "+(a^b));//0010^0011=0001=1
		//bitwiseNOT
		System.out.println("The value of (~a): "+(~a));//inverts all bits result depends on system
		//bitwiseLeftShift
		System.out.println("The value of (b<<2): "+(b<<2));//3*2^a=3*2^2=3*4=12
		//bitwiseRightShift
		System.out.println("The value of (a>>1): "+(a>>1));//2/1^3=2/1=1
		
		
		
		

	}

}
