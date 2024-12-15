package org.tnsif.capgemini.c2tc.oops;

class Animal2{
	void eat() {
		System.out.println("Animal Is Eating");
	}
}
class Lion extends Animal2{
	void sleep()
	{
		System.out.println("Lion Is Sleeping");
	}
}
class Tiger extends Animal2{
	void bark()
	{
		System.out.println("Tiger Is Barking");
	}
}
class Elephant extends Animal2{
	void trumpet()
	{
		System.out.println("Elephant is trumpet");
	}
}

public class Hierarchical_InheritanceDemo {

	public static void main(String[] args) {
		Lion obj1=new Lion();
		obj1.eat();
		obj1.sleep();
		Tiger obj2=new Tiger();
		obj2.eat();
		obj2.bark();
		Elephant obj3=new Elephant();
		obj3.eat();
		obj3.trumpet();

	}

}
