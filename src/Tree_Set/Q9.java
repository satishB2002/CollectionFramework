package Tree_Set;
//9. Write a Java program to find the numbers less than 7 in a tree set.

import java.util.TreeSet;

public class Q9 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(5);
	ts.add(7);
	ts.add(19);
	ts.add(120);
	ts.add(1220);
	ts.add(1035);
	
	System.out.println(ts.headSet(7));
}
}
