package Assignment_PAttern_Stream;
//13. Write a Java program to remove first and last element from a linked list. 

import java.util.LinkedList;

public class Q21 {
public static void main(String[] args) {
	LinkedList ls=new LinkedList();
	ls.add(159);
	ls.add(259);
	ls.add(359);
	ls.add(459);
	ls.add(559);
	ls.removeFirst();
	ls.removeLast();
	System.out.println(ls);
}
}
