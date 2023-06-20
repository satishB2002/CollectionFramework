package Assignment_TreeMap;

import java.util.Collections;
import java.util.TreeMap;

/*10. Write a Java program to get a reverse order view of the keys contained
in a given map.*/
public class Q10 {
public static void main(String[] args) {
	TreeMap<Integer,String> tm=new TreeMap(Collections.reverseOrder());
	tm.put(94,"aqwe");
	tm.put(14,"Sehj");
	tm.put(1224,"LBJHBhj");
	tm.put(4,"vkhke");
	System.out.println(tm);
}
}
