package Se_Interface;

import java.util.Collections;
import java.util.HashSet;

/*1. Write a Java program to append the specified element to the end of a hash
set.*/
public class Q1 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	
	hs.add(369);
	System.out.println(hs);
}
}
