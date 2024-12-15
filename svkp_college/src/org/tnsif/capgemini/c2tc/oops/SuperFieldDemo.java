package org.tnsif.capgemini.c2tc.oops;
class Animal9
	{
		String name="animal";
	}
	class Dog9 extends Animal9
	{ 
		String name="Dog"; 
		void display() {
	      System.out.println("The super class name is :"+super.name);
		  System.out.println("The sub class name is:"+name);
		}
	}
	public class SuperFieldDemo {
public static void main(String[] args) {
	Dog9 dogs=new Dog9();
	dogs.display();
		

	}

}
