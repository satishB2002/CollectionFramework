package Assignment_TreeMap;
/*23. Write a Java program to get a portion of a map whose keys are greater
than or equal to a given key.*/


import java.util.TreeMap;

public class Q23 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	
	tm.put(121,"vdvbj");
	tm.put(161,"svoidj");
	tm.put(421,"jndkjj");
	tm.put(721,"vvosdhuj");
	tm.put(621,"vbdzb,");
	System.out.println(tm.tailMap(421));
}
}
