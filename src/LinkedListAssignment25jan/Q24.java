package LinkedListAssignment25jan;

import java.util.LinkedList;

//24. Write a Java program to compare two linked lists.
public class Q24 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(1);
	lk.add(2);
	lk.add(3);
	lk.add(4);
	LinkedList lm=new LinkedList();
	lm.add(5);
	lm.add(6);
	lm.add(7);
	lm.add(8);
	System.out.println(lk.equals(lm));
	
}
}
