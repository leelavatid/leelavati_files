package org.tnsif.capgemini.c2tc.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		
		pq.add(11);
		pq.add(1);
		pq.add(15);
		pq.add(40);
		
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}