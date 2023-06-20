package Tree_Set;
//16. Write a Java program to remove a given element from a tree set.

import java.util.TreeSet;

public class Q16 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(52);
	ts.add(53);
	ts.add(51);
	ts.add(58);
	System.out.println(ts.remove(51));
}
}
