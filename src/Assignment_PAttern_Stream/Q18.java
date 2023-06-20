package Assignment_PAttern_Stream;

import java.util.LinkedList;

//6. Write a Java program to insert elements into the linked list at the first and last position.

public class Q18 {
public static void main(String[] args) {
	LinkedList ls=new LinkedList();
	ls.add(123);
	ls.add(323);
	ls.add(423);
	ls.add(523);
	ls.add(823);
	ls.add(623);
	ls.addFirst(121);
	ls.addLast(500);
	System.out.println(ls);
}
}
