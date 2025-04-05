package org.tnsif.capgemini.c2tc.interfacedemoexamples;

public class MarkerDriverDemo {

	public static void main(String[] args) {
	Registrable s1=new Student(100,"leela",18000,"java");
	Registrable s2= new Student(101,"mahi",20000,"python");
	Object in=new Object();
	if(s2 instanceof Registrable) {
			System.out.println("student is registered for the course");
	}
	else {
		System.out.println("student is not registered for the course");
	}
	
    }
	}