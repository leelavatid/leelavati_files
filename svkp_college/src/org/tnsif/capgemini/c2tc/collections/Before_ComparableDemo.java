package org.tnsif.capgemini.c2tc.collections;

class Person
{
	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}	
	void displayinfo()
	{
		System.out.println("Name : "+ name  + " Age :"+ age);
	}
}
public class Before_ComparableDemo {

	public static void main(String[] args) {
		Person person1=new Person("leelavathi",24);
		Person person2=new Person("akash",18);
		person1.displayinfo();
		person2.displayinfo();
	}


}
