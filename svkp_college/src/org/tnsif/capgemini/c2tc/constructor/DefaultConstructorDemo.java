package org.tnsif.capgemini.c2tc.constructor;
 class MyClass1{
	 String color;
	 String brand;
	 int cost;
	 MyClass1()
	 {
		 color="Red";
		 brand="Audi";
		 cost=150000;
	 }
 }
public class DefaultConstructorDemo {
public static void main(String[] args) {
		MyClass1 obj=new MyClass1();
		System.out.println(obj.color+"\n"+obj.brand+"\n"+obj.cost);
		System.out.println(obj.color+"\n"+obj.brand+"\n"+obj.cost);
		

	}

}
