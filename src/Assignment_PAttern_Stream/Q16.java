package Assignment_PAttern_Stream;
//4. Write a Java program to iterate a linked list in reverse order.
import java.util.LinkedList;
import java.util.ListIterator;

public class Q16 {
public static void main(String[] args) {
	LinkedList ls=new LinkedList();
	ls.add(321);
	ls.add(621);
	ls.add(721);
	ls.add(821);
	ls.add(921);
	ListIterator  itr=ls.listIterator(ls.size());
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	
}
}
