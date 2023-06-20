package Queqe_Interface;

import java.util.PriorityQueue;

public class Ex_Contains_All {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add(126);
	pq.add(136);
	pq.add(186);
	pq.add(196);
	pq.add(116);
	PriorityQueue pq1=new PriorityQueue();
	pq1.add(136);
	pq1.add(1746);
	pq1.add(12586);
	pq1.add(196);
	pq1.add(116);
	System.out.println(pq.containsAll(pq1));
}
}
