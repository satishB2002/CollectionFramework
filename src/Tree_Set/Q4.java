package Tree_Set;
/*4. Write a Java program to create a reverse order view of the elements contained
in a given tree set.*/

import java.util.TreeSet;

import javax.swing.text.ElementIterator;

public class Q4 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(14);
	ts.add(24);
	ts.add(74);
	ts.add(94);
	ts.add(364);

	System.out.println(ts.descendingSet());
	
	
	
}
}
