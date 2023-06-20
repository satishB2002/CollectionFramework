package Assignment_TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Q22 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	SortedMap<Integer,String> ss=new TreeMap();
	tm.put(121,"vdvbj");
	tm.put(161,"svoidj");
	tm.put(421,"jndkjj");
	tm.put(721,"vvosdhuj");
	tm.put(621,"vbdzb,");
	System.out.println(tm);
	ss = tm.subMap(121, 421);
	System.out.println(ss);
	
}
}
