package org.tnsif.capgemini.c2tc.scanner_bufferreader;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name=in.nextLine();
    System.out.println("Enter your age: ");
    int age=in.nextInt();
    System.out.println("The person name is:"+name+" The person age is:"+age);
    in.close();
    
	}

}
