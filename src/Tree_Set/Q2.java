package Tree_Set;

import java.text.BreakIterator;
import java.util.Iterator;
import java.util.TreeSet;

//2. Write a Java program to iterate through all elements in a tree set.

public class Q2 {
public static void main(String[] args) {
	TreeSet  ts=new TreeSet();
	ts.add(147);
	ts.add(146);
	ts.add(144);
	ts.add(1418);
	ts.add(1437);
	System.out.println(ts);
	Iterator itr=ts.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}

}
