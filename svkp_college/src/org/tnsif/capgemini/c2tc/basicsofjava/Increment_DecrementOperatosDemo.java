package org.tnsif.capgemini.c2tc.basicsofjava;

public class Increment_DecrementOperatosDemo {

	public static void main(String[] args) {
		int a=5;
		System.out.println("The post Increment and Decrement:");
		
		//post increment
		System.out.println("The post increment "+a++);//print first then increment
		System.out.println("After the post increment "+a);
		
		//post decrement
		System.out.println("The post decrement "+a--);//print 1st the decrement
		System.out.println("After the decrement "+a );
		
		System.out.println("The pre Increment and Decrement:");
		
		//pre increment
		System.out.println("Ater the pre Increment "+ ++a);//1st increment then print
		
		//pre decrement
		System.out.println("Ater the Pre Decrement "+--a);//1st decrement then print
		

	}

}
