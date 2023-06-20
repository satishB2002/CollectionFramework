package Tree_Set;
//15. Write a Java program to retrieve and remove the last element of a tree set.

import java.util.TreeSet;

public class Q15 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(12);
	ts.add(92);
	ts.add(82);
	ts.add(72);
	ts.add(22);
	System.out.println(ts.pollLast());
}
}
