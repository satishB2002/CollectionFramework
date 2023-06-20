package LinkedListAssignment25jan;
//6. Write a Java program to insert elements into 
//the linked list at the first and last position.

import java.util.LinkedList;

public class Q6 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(true);
	lk.add(false);
	lk.add(true);
	lk.add(false);
	lk.add(true);
	lk.addFirst(false);
	lk.addFirst(true);
	System.out.println(lk);
}
}
