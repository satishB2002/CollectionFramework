package Se_Interface;

import java.util.HashSet;

//6. Write a Java program to clone a hash set to another hash set.

public class Q6 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(11);
	hs.add(21);
	hs.add(18);
	hs.add(17);
	//System.out.println(hs);
	HashSet hs1=new HashSet();
	hs1.add(111);
	hs1.add(221);
	hs1.add(128);
	hs1.add(137);
	
	System.out.println(hs);
}
}
