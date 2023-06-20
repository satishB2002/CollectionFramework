package Vector;
//10. Java program to add elements of a vector to other vector collection at the specified

import java.util.Vector;

public class Q10 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(100);
	vb.add(900);
	vb.add(800);
	vb.add(400);
	Vector vb1=new Vector();
	vb1.add(1000);
	vb1.add(9000);
	vb1.add(8000);
	vb1.add(4000);
	vb1.addAll(3, vb);
	System.out.println(vb1);
}
}
