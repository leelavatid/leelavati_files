package org.tnsif.capgemini.c2tc.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, 200);
		map.put(2, 200);
		map.put(3, 300);
		map.put(4, 400);
		
		
		System.out.println("Intial Map "+ map);
		
		//retreive a value by key
	     int valueforkey=map.get(1);
	     System.out.println("Valueforkey "+ valueforkey);
	     
	     //updating the value
	     map.put(4, 900);
	     System.out.println(map);
	     
	     //removing an entry key
	     map.remove(3);
	     System.out.println(map);
	     
	     //checking if key exists
	    boolean hashkey =map.containsKey(1);
	    System.out.println("checking if key exists" + hashkey);
	    
	    //chceking if value exists
	    
	    boolean hashvalue =map.containsValue(300);
	    System.out.println("checking if value exists "+hashvalue);
	    
	    //getting the size of the map
	    int size1=map.size();
	    System.out.println(size1);
	    
	    //clearing all entries in map
	    map.clear();	    
	    System.out.println(map);
	    
	}
	

}