package Queqe_Interface;
//12. Write a Java program to change priorityQueue to maximum priorityqueue.

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class Q12 {
public static void main(String[] args) {

	PriorityQueue pq=new PriorityQueue(Collections.reverseOrder());
	pq.add(891);
	pq.add(14);
	pq.add(55);
	pq.add(136);
System.out.println(pq);
System.out.println(pq.peek());
}
}
