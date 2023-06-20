package ArrayListAssignment;

import java.util.ArrayList;

//13. Write a Java program to compare two array lists. 

public class Q13 {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ArrayList ar1=new ArrayList();
		ar1.add(25);
		ar1.add(26);
		ar1.add(30);
		ar1.add(40);
		System.out.println(ar);
		System.out.println(ar1);
		System.out.println(ar.containsAll(ar1));
	}

}
