package Se_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

//2. Write a Java program to iterate through all elements in a hash list.
public class Q2 {
public static void main(String[] args) {
	LinkedList hs=new LinkedList();
	hs.add(100);
	hs.add(200);
	hs.add(300);
	hs.add(400);
	System.out.println(hs);
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

}
}
