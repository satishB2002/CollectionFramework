package Vector;
//13. Java program to check whether a Vector collection contains a specified item or not

import java.util.Vector;

public class Q13 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(111);
	vb.add(151);
	vb.add(121);
	
	System.out.println(vb.contains(151));
}
}
