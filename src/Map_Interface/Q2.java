package Map_Interface;

import java.util.HashMap;

//2. Write a Java program to count the number of key-value (size) mappings in a map
public class Q2 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(147, 741);
	hm.put(852, 'S');
	hm.put('p', "ASDF");
	System.out.println(hm.size());
}
}
