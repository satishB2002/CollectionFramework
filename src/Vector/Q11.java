package Vector;
//11. Java program to remove all elements of Vector collection

import java.util.Vector;

public class Q11 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(100);
	vb.add(300);
	vb.add(400);
	vb.add(900);
	vb.removeAll(vb);
	System.out.println(vb);
}
}
