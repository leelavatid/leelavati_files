package org.tnsif.capgemini.c2tc.oops;

class Animal7{
	Animal7(){
		System.out.println("Animal Constructor");
	}
}
class Cat7 extends Animal7{
	Cat7()
	{
		super();
		System.out.println("Cat Constructor");
	}
}
public class SuperConstructorDemo {
public static void main(String[] args) {
    Cat7 obj=new Cat7();


	}

}
