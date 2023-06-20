package ArrayListAssignment;

import java.util.ArrayList;

//3. Write a Java program to insert an element into the array list at the first position.

public class Q3 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(11);
	ar.add(12);
	ar.add(13);
	ar.add(14);
	ar.add(15);
	ar.add(16);
	ar.add(17);
	ar.add(18);
	ar.add(19);
	ar.add(20);
	ar.add(0, 21);
	System.out.println(ar);
	
}
}
