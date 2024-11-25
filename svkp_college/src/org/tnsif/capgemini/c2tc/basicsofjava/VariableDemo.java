package org.tnsif.capgemini.c2tc.basicsofjava;

public class VariableDemo {
    String str="hello"; //instance variable
        void print()
        {
	     int id=10;//local variable
         System.out.println("the number is:"+id);
        }   
  static String mesg="hello students";//static variable
  public static void main(String args[])
  {
  	VariableDemo in=new VariableDemo();
  	System.out.println(in.str);
  	System.out.println(mesg);
  	 in.print();
 }
}