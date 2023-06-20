package Tree_Set;
/*10. Write a Java program to get the element in a tree set which is greater than or
equal to the given element.*/

import java.util.TreeSet;

public class Q10 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(84);
	ts.add(24);
	ts.add(34);
	ts.add(14);
	ts.add(1);
		System.out.println(ts.ceiling(1));
	
}
}
