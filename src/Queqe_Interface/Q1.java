package Queqe_Interface;

import java.util.PriorityQueue;

/*1.Write a Java program to create a new priority queue, add some colors (string)
and print out the elements of the priority queue.*/
public class Q1 {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add("Pink");
	pq.add("Yellow");
	pq.add("White");
	pq.add("Black");
	pq.add("Blue");
System.out.println(pq);
}
}
