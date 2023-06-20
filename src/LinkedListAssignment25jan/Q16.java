package LinkedListAssignment25jan;

import java.util.Collections;
import java.util.LinkedList;

//16. Write a Java program to shuffle the elements in a linked list. 

public class Q16 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add('A');
	lk.add('B');
	lk.add('c');
	lk.add('D');
	lk.add('E');
	lk.add('F');
	Collections.shuffle(lk);
	System.out.println(lk);
}
}
