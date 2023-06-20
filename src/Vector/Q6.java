package Vector;
//6. Java program to remove a specified item from Vector collection

import java.util.Vector;

public class Q6 {
public static void main(String[] args) {
	Vector vb=new Vector();
	vb.add("Sa");
	vb.add("Sb");
	vb.add("Sc");
	vb.add("Sd");
	vb.removeElement("Sc");
	System.out.println(vb);
}
}
