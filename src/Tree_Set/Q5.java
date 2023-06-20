package Tree_Set;
//5. Write a Java program to get the first and last elements in a tree set.

import java.util.TreeSet;

public class Q5 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(11);
	ts.add(91);
	ts.add(71);
	ts.add(31);
	ts.add(11);
	ts.add(852);
	System.out.println(ts.first());
	System.out.println(ts.last());
}
}
