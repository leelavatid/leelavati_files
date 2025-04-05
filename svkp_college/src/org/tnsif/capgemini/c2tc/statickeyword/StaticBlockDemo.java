package org.tnsif.capgemini.c2tc.statickeyword;

public class StaticBlockDemo {
 public void display() {
	 System.out.println("Instance Block-1");
 }
 static {
	 System.out.println("Static Block-1");
 }
 static {
	 System.out.println("Static Block-2");
 }
	public static void main(String[] args) {
		StaticBlockDemo in=new StaticBlockDemo();
		in.display();

	}

}
