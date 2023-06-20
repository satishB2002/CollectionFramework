package Assignment_TreeMap;

import java.util.TreeMap;

/*8. Write a Java program to get a key-value mapping associated with the
greatest key and the least key in a map.*/
public class Q8 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap();
	tm.put(11, "Satj");
	tm.put(91, "NKJ");
	tm.put(21, "JHBHJBj");
	tm.put(851, "SJH5atj");
	tm.put(1, "Sat^^GKj");
	tm.put(15, "S7atj");
	System.out.println(tm.pollLastEntry());
	
	
}
}
