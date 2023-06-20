package Assignment_PAttern_Stream;

import java.util.LinkedList;

//12. Write a Java program to remove a specified element from a linked list.

public class Q20 {
public static void main(String[] args) {
	LinkedList ls=new LinkedList();
	ls.add(147);
	ls.add(247);
	ls.add(347);
	ls.add(447);
	ls.add(547);
	ls.remove(3);
	System.out.println(ls);
}
}
