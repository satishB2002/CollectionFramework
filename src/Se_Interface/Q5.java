package Se_Interface;

import java.util.HashSet;

//5. Write a Java program to test a hash set is empty or not.

public class Q5 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(111);
	hs.add(121);
	hs.add(112);
	hs.add(211);
	System.out.println(hs.isEmpty());
}
}
