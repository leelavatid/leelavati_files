package org.tnsif.capgemini.c2tc.collections;

import java.util.List;
import java.util.Vector;

public class VectorDemoExample {

	public static void main(String[] args) {
	    List<Integer> numbers=new Vector<>();
	    
	    numbers.add(100);
	    numbers.add(200);
	    numbers.add(300);
	    numbers.add(400);
	    
	    //access the elements
	    System.out.println("First number "+ numbers.get(0));
	    
	    //modify an element
	    numbers.set(1,250);
	    
	    //remove the element
	    numbers.remove(3);
	    
	    System.out.println(numbers);
	    
	    //check if exits
	    
	    if(numbers.contains(10))
	    {
	    	System.out.println("10 is present");
	    }

	    
	    //print all elements
	    
	    for(Integer num  :numbers)
	    {
	    	System.out.println(num);
	    }
	    
	    //size
	    
	    System.out.println("Size of vector data " + numbers.size());
	    
	    numbers.clear();
	    System.out.println("List after clear operation" + numbers);
	}
	
	

}