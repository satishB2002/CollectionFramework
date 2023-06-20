package LinkedListAssignment25jan;

import java.util.Collections;
import java.util.LinkedList;

//25. Write a Java program to test an linked list is empty or not.

public class Q25 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	
	lk.add(100);
	lk.add(200);
	lk.add(300);
	lk.add(400);
	lk.add(500);
	System.out.println(lk.isEmpty());
	
}
}
