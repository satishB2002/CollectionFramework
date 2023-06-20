package LinkedListAssignment25jan;
//15. Write a Java program of swap two elements in a linked list. 

import java.util.Collections;
import java.util.LinkedList;

public class Q15 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add('A');
	lk.add('B');
	lk.add('C');
	lk.add('D');
	lk.add('E');
	Collections.swap(lk, 3, 4);
		System.out.println(lk);
}
}
