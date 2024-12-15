package org.tnsif.capgemini.c2tc.oops;


	class Animal4{
		void makeSound()
		{
			System.out.println("Animal Make Sound");
		}
	}
 class Cat4 extends Animal4
 {
	 void makeSound()
	 {
		 System.out.println("Cat Make Sound");
	 }
 }
 class Dog4 extends Animal4{
	 void makeSound()
	 {
		 System.out.println("Dog Make Sound");
	 }
 }
 class Lion4 extends Animal4{
	 void makeSound()
	 {
		 System.out.println("Lion Make Sound");
	 }
 }
 public class MethodOverriding_InheritanceDemo {
	public static void main(String[] args) {
		Animal4 obj=new Animal4();
		Cat4 obj1=new Cat4();
		Dog4 obj2=new Dog4();
		Lion4 obj3=new Lion4();
		obj.makeSound();
		obj1.makeSound();
		obj2.makeSound();
		obj3.makeSound();
	}

}
