package Tree_Set;
/*3. Write a Java program to add all the elements of a specified tree set to another
tree set.*/

import java.util.TreeSet;

public class Q3 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(47);
	ts.add(27);
	ts.add(37);
	ts.add(97);
	ts.add(45);
	
	TreeSet ts1=new TreeSet();
	ts1.add(425);
	ts1.add(267);
	ts.addAll(ts1);
	System.out.println(ts);
	
	
	
}
}
