package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//11. Write a Java program to reverse elements in a array list. 

public class Q11 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(13);
	ar.add(14);
	ar.add(15);
	ar.add(16);
	ar.add(17);
	Collections.reverse(ar);
	System.out.println(ar);
	
}
}
