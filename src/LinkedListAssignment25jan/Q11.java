package LinkedListAssignment25jan;

import java.util.LinkedList;
import java.util.ListIterator;

//11. Write a Java program to display the elements and their 
//positions in a linked list. 

public class Q11 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(122);
	lk.add(125);
	lk.add(1248);
	lk.add(1152);
	lk.add(1142);
	lk.add(1234);
	System.out.println(lk.get(3));
	
	ListIterator itr=lk.listIterator();
	int n=0;
	while(itr.hasNext())
	{
		
		System.out.println(itr.next());
	}
	
}
}
