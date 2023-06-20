package Tree_Set;
//14. Write a Java program to retrieve and remove the first element of a tree set.

import java.util.TreeSet;

public class Q14 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(111);
	ts.add(211);
	ts.add(911);
	ts.add(411);
	ts.add(511);
	System.out.println(ts.pollFirst());
}
}
