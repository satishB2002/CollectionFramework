package Assignment_TreeMap;
//5. Write a Java program to get all keys from the given a Tree Map.

import java.util.TreeMap;

public class Q5 {
public static void main(String[] args) {
TreeMap<Character, Integer>	 tm=new TreeMap();
tm.put('D', 14);
tm.put('L', 24);
tm.put('U', 34);
tm.put('W', 44);
tm.put('Q', 84);
System.out.println(tm.keySet());
}
}
