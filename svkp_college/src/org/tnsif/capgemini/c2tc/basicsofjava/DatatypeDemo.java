package org.tnsif.capgemini.c2tc.basicsofjava;

public class DatatypeDemo {

	public static void main(String[] args) {
		//byte->1byte
		byte bytMax=127;
		byte bytMin=-128;
		System.out.println("the maximum byte value is: "+ bytMax );
	    System.out.println("the min byte value: "+ bytMin);
		//short->2bytes
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("min range of short: "+ shortMin); 
	    System.out.println("the max range of short: "+ shortMax);
		//long->8bytes
		long longMax=9223372036854775807L;
		long longMin=-9223372036854775808L;
		System.out.println("the max range of long: " +longMax);
		System.out.println("the min range of long: "+ longMin);
		//int->4bytes
		int intMax= 2147483647;
		int intMin=-2147483648;
		System.out.println("the min range of int is: "+ intMin );
		System.out.println("the max range of int is: "+ intMax);
		//float->4bytes
		float f1=2435.56754f;
		System.out.println("float value is: "+f1);
		//double->8bytes
		double d1=4567.9876785477d;
		System.out.println("the double value is: "+d1);
		//boolean->1byte
		boolean str=true;
		System.out.println("the boolean value is: "+str);
		//char->2bytes
		char c='F';
		System.out.println("the char value is: "+c);
		}
}
