package Tree_Set;

import java.util.TreeSet;

public class Ex_trreSet {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(91);
	ts.add(1);
	ts.add(61);
	ts.add(651);
	ts.add(71);
	ts.add(7411);
	System.out.println(ts);
	System.out.println("\tCiline Method");
	System.out.println(ts.ceiling(60));
	System.out.println("\tfirst Method");
	System.out.println(ts.first());
	System.out.println("\tfloor Method");
	System.out.println(ts.floor(651));
	System.out.println("\thigher Method");
	System.out.println(ts.higher(61));
	System.out.println("\tlower Method");
	System.out.println(ts.lower(1));
	
	System.out.println("\tPollfirst Method");
	System.out.println(ts.pollFirst());
	System.out.println("\tPollLast Method");
	System.out.println(ts.pollLast());
	System.out.println("\ttailSet Method");
	System.out.println(ts.tailSet(71));
	System.out.println("\theadSet Method");
	System.out.println(ts.headSet(91, false));
	
}
}
