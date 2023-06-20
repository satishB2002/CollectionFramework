package Queqe_Interface;

import java.util.PriorityQueue;

/*10. Write a Java program to convert a priority queue to an array containing all of
the elements of the queue.*/
public class Q10 {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add(147);
	pq.add(137);
	pq.add(127);
	pq.add(117);
	Object []obj=pq.toArray();
	for (int i = 0; i < obj.length; i++) {
		System.out.println();
	}
	
}
}
