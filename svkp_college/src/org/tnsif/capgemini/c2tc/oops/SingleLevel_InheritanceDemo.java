package org.tnsif.capgemini.c2tc.oops;

class Animal{
	String name= "Animal";
	void eat() {
       System.out.println(name+"is eating");	
}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
public class SingleLevel_InheritanceDemo {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eat();
		obj.bark();
		}
	}


