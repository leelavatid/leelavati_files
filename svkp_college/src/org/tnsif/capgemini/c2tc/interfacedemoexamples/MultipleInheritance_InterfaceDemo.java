package org.tnsif.capgemini.c2tc.interfacedemoexamples;

interface printer
{
	void print(String message);
}
interface scanner
{
	void scan(String document);
}

class MultiFunctionalDevice implements printer,scanner
{

	@Override
	public void scan(String document) {
		
		System.out.println("Scanning " +document);
	}

	@Override
	public void print(String message) {
		
		System.out.println("Printing " +message);
	}
	
}

public class MultipleInheritance_InterfaceDemo {

	public static void main(String[] args) {
		MultiFunctionalDevice obj=new MultiFunctionalDevice();
		obj.print("hello world! message");
		obj.scan("document.pdf file");
	}

}