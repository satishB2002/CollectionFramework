package Assignment_PAttern_Stream;
import java.util.Iterator;
//2. Write a Java program to iterate through all elements in a linked list.
import java.util.LinkedList;

public class Q14 {
public static void main(String[] args) {
	LinkedList ls=new LinkedList();
	ls.add(1000);
	ls.add(0500);
	ls.add(9000);
	ls.add(5000);
	Iterator itr=ls.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
