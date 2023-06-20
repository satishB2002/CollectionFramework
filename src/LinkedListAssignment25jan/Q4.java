package LinkedListAssignment25jan;

import java.util.LinkedList;
import java.util.ListIterator;

//4. Write a Java program to iterate a linked list in reverse order. 

public class Q4 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add('A');
	lk.add('B');
	lk.add('C');
	lk.add('D');
	ListIterator itr=lk.listIterator(lk.size());
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
}
}
