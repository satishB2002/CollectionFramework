package Vector;
//18. Java program to compare two Vector collections.

import java.util.Collections;
import java.util.Vector;

public class Q18 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(1);
	vb.add(2);
	vb.add(3);
	vb.add(4);
	Vector vb1=new Vector();
	vb1.add(11);
	vb1.add(21);
	vb1.add(31);
	vb1.add(41);
	System.out.println(vb.equals(vb1));
	
}
}
