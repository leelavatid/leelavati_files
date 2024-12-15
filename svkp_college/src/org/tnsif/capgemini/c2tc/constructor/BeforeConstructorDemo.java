package org.tnsif.capgemini.c2tc.constructor;

class MyClass{
	String color;
	String brand;
	int cost;
}
public class BeforeConstructorDemo {
	public static void main(String[] args) {
		MyClass obj=new MyClass();
		System.out.println(obj.color+"\n"+obj.brand+"\n"+obj.cost);

	}

}
