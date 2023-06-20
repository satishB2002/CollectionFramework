package Assignment_TreeMap;

import java.util.TreeMap;

/*25. Write a Java program to get a key-value mapping associated with the
least key greater than or equal to the given key. Return null if there is no
such key.*/

public class Q25 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	tm.put(154, "huvhsh");
	tm.put(114, "b,svhh");
	tm.put(124, "vsbjd");
	tm.put(164, "hvskjd");
	tm.put(174, "hjefhh");
	tm.tailMap(124);
}
}
