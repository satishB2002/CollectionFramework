package Linked_HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_Ex {
public static void main(String[] args) {
	LinkedHashSet ls=new LinkedHashSet();
	ls.add(11);
	ls.add(21);
	LinkedHashSet ls1=new LinkedHashSet();
	ls1.add(123);
	ls1.add(231);
	ls.add(31);
	ls.add(41);
	ls.add(51);
	ls.add(61);
	ls.add(71);
	System.out.println(ls);
	System.out.println("\tClear Method");
	ls.clear();
	System.out.println(ls);
	System.out.println("\tisEmpty Method");
	System.out.println(ls.isEmpty());
	System.out.println("\tcintains Method");
	System.out.println(ls.contains(ls1));
	System.out.println("\tcontainsAll Method");
	System.out.println(ls.containsAll(ls1));
	System.out.println("\tequals Method");
	System.out.println(ls.equals(ls1));
		
	

}
}
