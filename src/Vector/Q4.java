package Vector;
//4. Java program to insert an item into Vector collection at the specified index

import java.util.Vector;

public class Q4 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(11);
	vb.add(12);
	vb.add(11);
	vb.add(14);
	vb.add(15);
	vb.add(3, 21);
	System.out.println(vb);
	
}
}
