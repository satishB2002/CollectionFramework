package LinkedListAssignment25jan;

import java.util.LinkedList;

import javax.swing.JList;

//5. Write a Java program to insert the specified element at the specified position in the linked list. 

public class Q5 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(10.00);
	lk.add(90.00);
	lk.add(650.00);
	lk.add(100.00);
	lk.add(510.00);
	 lk.add(3, 89.00);
	 System.out.println(lk);
}
}
