package org.tnsif.capgemini.c2tc.scanner_bufferreader;

import java.util.Scanner;

public class CharReading {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		char m=in.next().charAt(5);
		System.out.println("The fith  char of the  input string is "+m);
		
		
	}

}
