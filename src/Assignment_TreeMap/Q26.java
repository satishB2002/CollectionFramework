package Assignment_TreeMap;

import java.util.TreeMap;

/*26. Write a Java program to get the least key greater than or equal to the
given key. Returns null if there is no such key.*/
public class Q26 {
public static void main(String[] args) {
TreeMap<Integer, String> tm=new TreeMap<>();
	
	tm.put(121,"vdvbj");
	tm.put(161,"svoidj");
	tm.put(421,"jndkjj");
	tm.put(721,"vvosdhuj");
	tm.put(621,"vbdzb,");
	System.out.println(tm.ceilingKey(120));
}
}
