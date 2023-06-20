package Assignment_TreeMap;

import java.util.TreeMap;

/*9. Write a Java program to get the first (lowest) key and the last (highest)
key currently in a map.*/
public class Q {
public static void main(String[] args) {
	TreeMap<Integer, Character> tm=new TreeMap<>();
	tm.put(12, 'R');
	tm.put(98, 'P');
	tm.put(82, 'E');
	tm.put(76, 'Q');
	tm.put(91, 'H');
	System.out.println(tm.pollFirstEntry());
	System.out.println(tm.pollLastEntry());
}
}
