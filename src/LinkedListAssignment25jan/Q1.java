package LinkedListAssignment25jan;

import java.util.LinkedList;

//1. Write a Java program to append the specified element to the end of a linked list. 
public class Q1 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(100);
	lk.add(200);
	lk.add(300);
	lk.add(400);
	lk.add(500);
	lk.add(5, 123);
	System.out.println(lk);
}
}
