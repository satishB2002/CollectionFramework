package LinkedListAssignment25jan;

import java.util.LinkedList;

//18. Write a Java program to clone an linked list to another linked list. 

public class Q18 {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add("ABCD");
	lk.add("BCDj");
	lk.add("oiCD");
	lk.add("FGJD");
	LinkedList lm=new LinkedList();
	lm.add("TYUj");
	lm.add("POID");
	//lk.clone();
	System.out.println(lk.clone());
	System.out.println(lm);
	
}
}
