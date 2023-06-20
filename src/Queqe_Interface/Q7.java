package Queqe_Interface;

import java.util.PriorityQueue;
//7. Write a Java program to compare two priority queues.

public class Q7 {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add(14);
	pq.add(24);
	pq.add(34);
	pq.add(44);
	PriorityQueue pq1=new PriorityQueue();
	pq1.add(14);
	pq1.add(24);
	pq1.add(34);
	pq1.add(44);
	System.out.println(pq.containsAll(pq1));
	
}
}
