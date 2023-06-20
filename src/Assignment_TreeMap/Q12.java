package Assignment_TreeMap;

import java.util.TreeMap;

/*12. Write a Java program to get the greatest key less than or equal to the
given key.*/
public class Q12 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	tm.put(121, "hrewvdjn");
	tm.put(521, "vndjn");
	tm.put(621, "hkdjn");
	tm.put(921, "hkjscjn");
	tm.put(111, "harwvjknj");
	tm.put(31, "hvkjnonk,");
	tm.put(11, "hzkzesvn");
	System.out.println(tm.lowerKey(31));
	
}
}
