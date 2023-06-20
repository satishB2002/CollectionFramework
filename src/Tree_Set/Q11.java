package Tree_Set;

import java.util.TreeSet;

/*11. Write a Java program to get the element in a tree set which is less than or
equal to the given element.*/
public class Q11 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(85);
	ts.add(75);
	ts.add(65);
	ts.add(855);
	ts.add(25);
	System.out.println(ts.floor(75));
	
}
}
