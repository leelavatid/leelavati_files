package org.tnsif.capgemini.c2tc.oops;


class Animal1{
	void eat() {
		System.out.println("Animal Is Eating");
	}
}
class Pig extends Animal1{
	void sleep()
	{
		System.out.println("Pig Is Sleeping");
	}
}
class Cat extends Pig
{
	void meow()
	{
		System.out.println("Cat Is Meowing");
	}
}
public class MultiLevel_InheritanceDemo {

	public static void main(String[] args) {
		Cat in=new Cat();
		in.eat();
		in.sleep();
		in.meow();
		
	}

}
