package Assignment_PAttern_Stream;
//5. Write a Java program to insert the specified element at the specified position in the linked list. 

import java.util.LinkedList;

public class Q17 {
public static void main(String[] args) {
	LinkedList ls=new LinkedList();
	ls.add(122);
	ls.add(122);
	ls.add(132);
	ls.add(152);
	ls.add(162);
	ls.add(172);
	ls.add(2, 222);
	System.out.println(ls);
}
}
