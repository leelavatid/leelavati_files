package org.tnsif.capgemini.c2tc.interfacedemoexamples;

class GreetingImp implements FunctionalInterfaceDemo
{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " +name+ " !");
		
	}
	
}

public class FunctionalDriverClassDemo {

	public static void main(String[] args) {
		FunctionalInterfaceDemo obj=new GreetingImp();
		obj.sayHello("Leelavathi");

	}

}