package Assignment_TreeMap;

import java.util.TreeMap;

/*17. Write a Java program to get the greatest key strictly less than the given
key. Return null if there is no such key.
Ans:*/

public class Q17 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	tm.put(121, "cshbdcygsd");
	tm.put(131, "vljhlvu");
	tm.put(141, "cbnsjkd");
	tm.put(151, "cbcsks");
	System.out.println(tm.higherKey(131));
}
}
