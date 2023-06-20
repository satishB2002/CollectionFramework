package Queqe_Interface;

import java.util.PriorityQueue;

/*3. Write a Java program to add all the elements of a priority queue to another
priority queue.*/

public class Q3 {
public static void main(String[] args) {
	PriorityQueue  pq=new PriorityQueue();
	pq.add(195);
	pq.add(185);
	pq.add(165);
	PriorityQueue  pq1=new PriorityQueue();
	pq1.add(225);
	pq1.add(335);
	pq1.add(445);
	pq.addAll(pq1);
	System.out.println(pq);
	
}
}
