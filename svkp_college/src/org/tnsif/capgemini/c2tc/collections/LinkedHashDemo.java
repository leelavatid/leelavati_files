package org.tnsif.capgemini.c2tc.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashDemo {

	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add(null);
		System.out.println("LinkedhashSet "+set);
	}

}
