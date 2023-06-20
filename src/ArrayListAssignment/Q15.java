package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//15. Write a Java program to join two array lists. Go to the editor

public class Q15 {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(101); 
		ar.add(102);
		ar.add(103);
		ar.add(105);
		ArrayList ar1=new ArrayList();
		ar1.add(106);
		ar1.add(107);
		ar1.add(108);
		ar1.add(109);
		ar1.add(110);
		ar.addAll(ar1);
		System.out.println(ar);
	}

}
