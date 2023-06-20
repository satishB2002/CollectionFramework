package Vector;
//12. Java program to create a clone of a Vector collection

import java.util.Vector;

public class Q12 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add(100);
	vb.add(300);
	vb.add(600);
	
	System.out.println(vb.clone());
	
}
}
