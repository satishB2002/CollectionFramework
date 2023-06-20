package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;


//10. Write a Java program to shuffle elements in a array list. 

public class Q10 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add("Satish");
	ar.add("Sagar");
	ar.add("Avi");
	ar.add("Vishal");
	ar.add("Tejas");
	Collections.shuffle(ar);
	System.out.println(ar);
}
}
