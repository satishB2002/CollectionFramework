package Vector;

import java.util.Vector;

public class Q3 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(12);
	vb.add(13);
	vb.add(14);
	Vector vb1=new Vector(vb);
	vb1.add(23);
	vb1.add(24);
	vb1.add(25);
	Vector vb2=new Vector(vb1);
	vb2.add(33);
	vb2.add(34);
	vb2.add(35);
	System.out.println(vb2);
}
}
