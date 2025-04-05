package org.tnsif.capgemini.c2tc.collections;

import java.util.List;
import java.util.Stack;

public class StackDemoExample {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		
		//push operation : add the elements
		
		stack.push(100); //1  //4
		stack.push(200); //2  //3
		stack.push(300); //3  //2
		stack.push(400); //4  //1
		
		//displaying the stack
		
		System.out.println("stack after pushes" + stack);
		
		//top element viewing without removing it
		System.out.println("top element "+ stack.peek());
		
		//pop operation :to remove an element
		System.out.println("pop operation " +stack.pop());
		System.out.println(stack);
		
		//checking if stack is empty
		
		System.out.println("stach is empty "+ stack.isEmpty());

		
		
		//search
		
		int position =stack.search(200);
		if(position !=-1)
		{
			System.out.println("Element found in " + position + " index pos");
		}
		else
		{
			System.out.println("Element not found " + position);
		}
	}

}