package Assignment_TreeMap;

import java.util.TreeMap;

//3. Write a Java program to search a key in a Tree Map.

public class Q3 {
public static void main(String[] args) {
	TreeMap<Double, Character> tm=new TreeMap();
	tm.put(12.0, 'R');
	tm.put(72.0, 'K');
	tm.put(52.0, 'U');
	tm.put(92.0, 'R');
	System.out.println(tm.containsKey(52.0));
}
}
