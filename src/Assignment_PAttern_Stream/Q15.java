package Assignment_PAttern_Stream;
//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.Iterator;
import java.util.LinkedList;

public class Q15 {
public static void main(String[] args) {
	LinkedList ls=new LinkedList();
	ls.add(145);
	ls.add(245);
	ls.add(345);
	ls.add(445);
	ls.addAll(4, ls);
	Iterator itr =ls.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
