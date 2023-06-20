package Se_Interface;
//4. Write a Java program to empty an hash set.

import java.util.HashSet;

public class Q4 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(111);
	hs.add(211);
	hs.add(121);
	hs.add(112);
	hs.clear();
	System.out.println(hs);
}
}
