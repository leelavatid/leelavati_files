package org.tnsif.capgemini.c2tc.oops;

class Animal10{
	 void makeSound()
	 {
		 System.out.println("Animal make sound");
	 }
 }
 class Dog10 extends Animal10{
	 void makeSound()
	 {
		 super.makeSound();
		 System.out.println("Dog is Barking");
	 }
 }

 public class SuperMethodDemo {	
public static void main(String[] args) {
	Dog10 obj=new Dog10();
	obj.makeSound();
	

	}

}
