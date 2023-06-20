package Assignment_TreeMap;

import java.util.TreeMap;

/*19. Write a Java program to remove and get a key-value mapping
associated with the least key in a map.
Ans:*/
public class Q19 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	tm.put(147, "jhcshb");
	tm.put(35, "jhcoewjcb");
	tm.put(17, "jchashb");
	tm.put(7, "jhuhlzd");
	System.out.println(tm.pollFirstEntry());
}
}
