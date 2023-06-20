package Assignment_TreeMap;

import java.util.TreeMap;

/*15. Write a Java program to get the least key strictly greater than the given
key. Return null if there is no such key.*/

public class Q15 {
public static void main(String[] args) {
	TreeMap<String,Integer> tm=new TreeMap();
	tm.put("Satish",121);
	tm.put("djxn",111);
	tm.put("hfskj",131);
	tm.put("fulsk",191);
	tm.put("eufhk",171);
	System.out.println(tm.higherKey("djxn"));
}
}
