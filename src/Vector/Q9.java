package Vector;
//9. Java program to add elements of a Vector to other Vector collection

import java.util.Vector;

public class Q9 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(100);
	vb.add(200);
	vb.add(030);
	vb.add(400);
	
	Vector vb1=new Vector();
	vb1.add(3600);
	vb1.add(2500);
	vb1.add(7430);
	vb1.add(9500);
	vb.addAll(vb1);
	System.out.println(vb);
	
}
}
