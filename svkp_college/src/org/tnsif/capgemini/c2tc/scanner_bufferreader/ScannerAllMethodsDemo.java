package org.tnsif.capgemini.c2tc.scanner_bufferreader;

import java.util.Scanner;

public class ScannerAllMethodsDemo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Your Name: ");
	String name=scan.nextLine();
	System.out.println("Enter Your Age: ");
	int age=scan.nextInt();
	System.out.println("Enter Your Height: ");
	float height=scan.nextFloat();
	System.out.println("Are You a Student?: ");
	boolean student=scan.nextBoolean();
   System.out.println("Enter Your Aadhar Number: ");
   long aadhar=scan.nextLong();
   System.out.println("Enter Your CGPA: ");
   double cgpa=scan.nextDouble();
    System.out.println("Enter Your Faviourate Teacher Name: ");
   String teacherName=scan.nextLine();
   System.out.println("Enter Your  Daily Reading Time in Minites:  ");
   byte minites=scan.nextByte();
   System.out.println("Enter your Hobby: ");
   String hobby=scan.nextLine();
   System.out.println("Enter Your Number Of Sibilling You Have: ");
  short sibilings=scan.nextShort();
  System.out.println("Student Information :");
  System.out.println("Your Name is: "+name);
  System.out.println("Your Age Is: "+age);
  System.out.println("Your Height: "+height);
  System.out.println("isStudent: "+student);
  System.out.println("Your Aadhar Number is: "+aadhar);
  System.out.println("Your CGPA Is: "+cgpa);
  System.out.println("Your Faviourate Teacher Name is: "+teacherName);
  System.out.println("Your  Daily Reading Time in Minites are: "+minites);
  System.out.println("Your Hobby is: "+hobby);
  System.out.println("You have"+sibilings+"Sibilings");
  scan.close();
  
   
	}

}
