package ArrayListAssignment;

import java.util.ArrayList;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list. 

public class Q4 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(5);
	ar.add(6);
	ar.add(7);
	ar.add(8);
	ar.add(9);
	ar.add(10);
	ar.add(11);
	ar.add(12);
	ar.add(13);
	System.out.println(ar.get(5));
}
}
