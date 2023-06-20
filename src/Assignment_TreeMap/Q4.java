package Assignment_TreeMap;

import java.util.TreeMap;

//4. Write a Java program to search a value in a Tree Map.

public class Q4 {
public static void main(String[] args) {
	TreeMap<Float, Double> tm=new TreeMap();
	tm.put(15.2f, 158.00);
	tm.put(14.2f, 185.00);
	tm.put(13.2f, 196.00);
	tm.put(12.2f, 175.00);
	tm.put(11.2f, 129.00);
	System.out.println(tm.containsValue(13.2));
}
}
