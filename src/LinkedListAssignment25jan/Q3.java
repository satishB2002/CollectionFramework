package LinkedListAssignment25jan;

import java.util.LinkedList;
import java.util.ListIterator;

//3. Write a Java program to iterate through all elements in a linked list starting at the specified position. 

public class Q3 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add("ABC");
	lk.add("XYZ");
	lk.add("LMN");
	lk.add("PQR");
	lk.add("RQT");
	lk.add("LKN");
	ListIterator itr =lk.listIterator(5);
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	
	
}
}
