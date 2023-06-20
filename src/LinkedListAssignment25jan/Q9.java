package LinkedListAssignment25jan;

import java.util.Collections;
import java.util.LinkedList;

//9. Write a Java program to insert some elements at the 
//specified position into a linked list. 

public class Q9 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(147);
	lk.add(247);
	lk.add(197);
	lk.add(141);
	lk.add(2, 12);
	System.out.println(lk);
}
}
