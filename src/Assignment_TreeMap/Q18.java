package Assignment_TreeMap;
/*18. Write a Java program to get NavigableSet view of the keys contained in
a map.*/

import java.util.TreeMap;

public class Q18 {
public static void main(String[] args) {
	TreeMap<Integer, String>  tm=new TreeMap<>();
	tm.put(147, "nkckjsd");
	tm.put(116, "nkckjsd");
	tm.put(149, "nkckjsd");
	tm.put(178, "nkckjsd");
	tm.put(187, "nkckjsd");
	System.out.println(tm.navigableKeySet());
	
}
}
