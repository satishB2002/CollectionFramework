package LinkedListAssignment25jan;

import java.util.LinkedList;

//19. Write a Java program to remove and return the first
//element of a linked list.

public class Q19 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add('A');
	lk.add('B');
	lk.add('C');
	lk.add('D');
	lk.add('E');
	lk.remove(2);
	lk.get(0);
	System.out.println(lk);
}
}
