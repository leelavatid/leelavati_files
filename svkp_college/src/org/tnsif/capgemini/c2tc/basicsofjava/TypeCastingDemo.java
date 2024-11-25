package org.tnsif.capgemini.c2tc.basicsofjava;

public class TypeCastingDemo {

	public static void main(String[] args) {
	//impicit typecasting
		short s=235;
		int i=s;
		System.out.println("the value is:"+i);
		char c='F';
		System.out.println("the value is:"+c);
		long l1=8979l;
		double d1=l1;
		System.out.println("the value is:"+d1);
		//explicit type casting
		double d2=3456.78765645d;
		int i1=(int)d2;
		System.out.println("the value is:"+i1);
		float f1=34.9989989f;
		double d3=(double)f1;
		System.out.println("the value is :"+d3);
		double d4=56.898765d;
		short s1=(short)d4;
		System.out.println("the value is:"+s1);
		}
}
