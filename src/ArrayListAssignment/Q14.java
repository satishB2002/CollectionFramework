package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//14. Write a Java program of swap two elements in an array list. 

public class Q14 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(100);
	ar.add(101);
	ar.add(102);
	ar.add(103);
	ar.add(104);
	ar.add(105);
	ar.add(106);
	ar.add(107);
	System.out.println(ar); 
	Collections.swap(ar, 0, 1);
	System.out.println(ar);
	
	
	
}
}
