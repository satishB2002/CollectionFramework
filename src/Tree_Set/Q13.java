package Tree_Set;
/*13. Write a Java program to get an element in a tree set which is strictly less than
the given element.*/

import java.util.TreeSet;

public class Q13 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(852);
	ts.add(952);
	ts.add(752);
	ts.add(652);
	System.out.println(ts.lower(952));
}
}
