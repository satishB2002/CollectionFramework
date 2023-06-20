package Assignment_TreeMap;

import java.util.TreeMap;

/*1. Write a Java program to associate the specified value with the specified
key in a Tree Map.*/
public class Q1 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap();
	tm.put(14,"G");
	tm.put(15,"K");
	tm.put(19,"F");
	tm.put(24,"V");
	tm.put(34,"M");
	tm.put(44,"S");
	
	System.out.println(tm);
}
}
