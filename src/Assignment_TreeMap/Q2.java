package Assignment_TreeMap;
//2. Write a Java program to copy a Tree Map content to another Tree Map.

import java.util.TreeMap;

public class Q2 {
public static void main(String[] args) {
	TreeMap<Character, String> tm=new TreeMap();
	tm.put('A',"Ser");
	tm.put('P',"oir");
	tm.put('T',"vghghvr");
	tm.put('W',"Serhbhj");
	TreeMap<Character, String> tm1=new TreeMap(tm);
	tm1.put('K',"Ser");
	tm1.put('Y',"oir");
	tm1.put('C',"vghghvr");
	tm1.put('N',"Serhbhj");
	System.out.println(tm1);
	
}
}
