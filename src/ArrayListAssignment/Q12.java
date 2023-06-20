package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//12. Write a Java program to extract a portion of a array list. 
public class Q12 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(2);
	ar.add(4);
	ar.add(6);
	ar.add(8);
	ar.add(10);
	ar.add(12);
	ar.add(22);
	System.out.println(ar);
System.out.println(ar.subList(0,3));
	
}
}
