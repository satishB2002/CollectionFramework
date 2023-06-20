package Assignment_TreeMap;

import java.util.TreeMap;

/*21. Write a Java program to get the portion of a map whose keys range
from a given key (inclusive), to another key (exclusive).*/

public class Q21 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	tm.put(121,"vdvbj");
	tm.put(161,"svoidj");
	tm.put(421,"jndkjj");
	tm.put(721,"vvosdhuj");
	tm.put(621,"vbdzb,");
	
	tm.subMap(161, 721);
	System.out.println(tm);
}
}
