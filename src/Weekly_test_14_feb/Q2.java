package Weekly_test_14_feb;

import java.util.ArrayList;

//Q2. Write a Java program to print all the elements of a ArrayList using the position of the
//elements.
public class Q2 {
public static void main(String[] args) {
	ArrayList ar =new ArrayList();
	ar.add(11);
	ar.add(13);
	ar.add(12);
	ar.add(14);
	System.out.println("Element Are Printed With Position");
	System.out.println(ar.get(0));
	System.out.println(ar.get(1));
	System.out.println(ar.get(2));
	System.out.println(ar.get(3));
}
}
