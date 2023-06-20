package Assignment_TreeMap;

import java.util.Collections;
import java.util.TreeMap;

//7. Write a Java program to sort keys in Tree Map by using comparator.

public class Q7 {
public static void main(String[] args) {
	TreeMap<Integer ,String> tm=new TreeMap(new comparater_jhb());
	tm.put(114, "sjcsjcb");
	tm.put(75, "suhvn");
	tm.put(94, " nkjz");
	tm.put(72, "sjknzj.b");
	
	
    
    System.out.println(tm);
	
}
}
