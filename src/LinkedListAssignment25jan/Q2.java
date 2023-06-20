package LinkedListAssignment25jan;
//2. Write a Java program to iterate through all elements in a linked list. 

import java.util.LinkedList;
import java.util.ListIterator;

public class Q2 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(111);
	lk.add(121);
	lk.add(191);
	lk.add(141);
	lk.add(131);
	lk.add(411);
	ListIterator itr=lk.listIterator(lk.size());
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
}
}
