package Vector;
//5. Java program to replace an item into Vector collection at the specified index

import java.util.Vector;

public class Q5 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(11);
	vb.add(12);
	vb.add(13);
	vb.add(14);
	vb.set(3, 21);
	System.out.println(vb);
}
}
