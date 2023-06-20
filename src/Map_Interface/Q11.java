package Map_Interface;

import java.util.HashMap;
import java.util.Map;

//11. Write a Java program to get a set view of the keys contained in this map.
public class Q11 {
public static void main(String[] args) {
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	hm.put('D', 7);
	hm.put('E', 8);
	hm.put('T', 6);
	hm.put('O', 5);
	hm.put('P', 4);
	hm.put('M', 3);
	System.out.println(" Key ");
	for (Map.Entry<Character,Integer > entry:hm.entrySet()) {
		System.out.println(entry.getKey());
	}
}
}
