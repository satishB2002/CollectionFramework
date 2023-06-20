package Vector;

import java.util.Vector;

/*14. Java program to check whether a Vector collection contains all elements of the specified
collection or not*/
public class Q14 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(123);
	vb.add(323);
	vb.add(423);
	vb.add(523);
	System.out.println(vb.containsAll(vb));
}
}
