package Tree_Set;
/*12. Write a Java program to get the element in a tree set which is strictly greater
than or equal to the given element.*/

import java.util.TreeSet;

public class Q12 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(147);
	ts.add(157);
	ts.add(167);
	ts.add(177);
	ts.add(127);
	System.out.println(ts.higher(127));
}
}
