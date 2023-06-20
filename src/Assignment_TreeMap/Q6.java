package Assignment_TreeMap;
//6. Write a Java program to delete all elements from a given Tree Map.

import java.util.TreeMap;

public class Q6 {
public static void main(String[] args) {
	TreeMap<Integer, Character> tm=new TreeMap<>();
	tm.put(15, 'E');
	tm.put(25, 'O');
	tm.put(13,'K');
	tm.put(11,'W');
	tm.clear();
	System.out.println(tm);
	
}
}
