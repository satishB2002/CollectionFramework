package Se_Interface;

import java.util.HashSet;

//7. Write a Java program to convert a hash set to an array.
public class Q7 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(369);
	hs.add(379);
	hs.add(389);
	hs.add(399);
	hs.add(3679);
	System.out.println(hs);
	Object []obj=hs.toArray();
	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
}
}
