package Tree_Set;
//8. Write a Java program to compare two tree sets.

import java.util.TreeSet;

public class Q8 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(18);
	ts.add(15);
	ts.add(14);
	ts.add(19);
	ts.add(145);
	TreeSet ts1=new TreeSet();
	ts1.add(189);
	ts1.add(1524);
	ts1.add(414);
	ts1.add(14);
	System.out.println(ts.containsAll(ts1));
		
}
}
