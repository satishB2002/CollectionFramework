package Queqe_Interface;
/*11. Write a Java program to convert a Priority Queue elements to a string
representation.*/

import java.util.PriorityQueue;

public class Q11 {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add("Satish");
	pq.add("Abc");
	pq.add("Mnp");

	pq.add("ASDF");
	System.out.println(pq);
}
}
