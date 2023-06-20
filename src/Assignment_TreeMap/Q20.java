package Assignment_TreeMap;

import java.util.TreeMap;

/*20. Write a Java program to remove and get a key-value mapping
associated with the greatest key in this map.*/

public class Q20 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	tm.put(121,"kvzhzhu");
	tm.put(191,"kvhsuhu");
	tm.put(141,"csbdcb");
	tm.put(131,"sbvb");
	tm.put(171,"svhsudv");
	System.out.println(tm.pollFirstEntry());
}
}
