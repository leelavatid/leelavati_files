package org.tnsif.capgemini.c2tc.collections;

import java.util.ArrayList;
import java.util.Collections;

class Person11 implements Comparable<Person11>
{
	String name;
	int age;
	
	public Person11(String name, int age) {
		
		this.name = name;
		this.age = age;
	}	
	void displayinfo()
	{
		System.out.println("Name : "+ name  + " Age :"+ age);
	}
	
	//sorting by age
	@Override
	public int compareTo(Person11 other) {
		
		return this.age-other.age;
	}

	
}
public class After_ComparableDemo {
public static void main(String[] args) {
		ArrayList<Person11> peoples=new ArrayList<>();
		peoples.add(new Person11("mamatha",22));
		peoples.add(new Person11("kalavathi",19));
		peoples.add(new Person11("kushuma",21));
		
		Collections.sort(peoples);
		
		for(Person11 person:peoples)
		{
			person.displayinfo();
		}
	}

}



