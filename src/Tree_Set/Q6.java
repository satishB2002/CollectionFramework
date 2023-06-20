package Tree_Set;
//6. Write a Java program to clone a tree set list to another tree set.

import java.util.TreeSet;

public class Q6 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(741);
	ts.add(121);
	ts.add(211);
	ts.add(311);
	ts.add(841);
	TreeSet ts1=new TreeSet();
	ts1.add(41);
	ts1.add(21);
	ts1.add(11);
	ts1.add(31);
	ts1.add(841);
	ts.clone();
	
	
}
}
