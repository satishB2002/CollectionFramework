package LinkedListAssignment25jan;

import java.util.LinkedList;

//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list. 

public class Q10 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(14);
	lk.add(164);
	lk.add(145);
	lk.add(147);
	lk.add(145);
	
	System.out.println("First Occurance="+lk.getFirst());
	System.out.println("Last Occurance="+lk.getLast());
}
}
