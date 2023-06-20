package Tree_Set;
//7. Write a Java program to get the number of elements in a tree set.

import java.util.TreeSet;

public class Q7 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(11);
	ts.add(81);
	ts.add(71);
	ts.add(61);
	ts.add(51);
	ts.add(31);
	System.out.println(ts.size());
}
}
