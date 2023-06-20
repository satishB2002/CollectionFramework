package Queqe_Interface;

import java.util.PriorityQueue;

public class Ex_PriorityQueue {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add(100);
	pq.add(50);
	pq.add(75);
	pq.add(20);
	pq.add(10);
	pq.add(350);
	System.out.println(pq);
	pq.poll();
	System.out.println(pq);
}
}
