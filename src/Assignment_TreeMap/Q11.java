package Assignment_TreeMap;

import java.util.TreeMap;

/*11. Write a Java program to get a key-value mapping associated with the
greatest key less than or equal to the given key.*/

public class Q11 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	tm.put(147,"SDr");
	tm.put(197,"SFr");
	tm.put(147,"SLLr");
	tm.put(137,"SaGGr");
	tm.put(117,"SWWar");
	System.out.println(tm.higherKey(25));
}

}
