package Vector;
//15. Java program to copy elements of Vector collection into an array

import java.util.Collections;
import java.util.Vector;

public class Q15 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(12365);
	vb.add(18365);
	vb.add(17365);
	vb.add(16365);
	vb.add(19365);
	Object []a=vb.toArray();
	a[0]=1;
	vb.copyInto(a);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
