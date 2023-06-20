package Queqe_Interface;

import java.util.Iterator;
import java.util.PriorityQueue;

//2. Write a Java program to iterate through all elements in the priority queue.
public class Q2 {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add(65);
	pq.add(85);
	pq.add(45);
	pq.add(95);
	Iterator itr=pq.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
