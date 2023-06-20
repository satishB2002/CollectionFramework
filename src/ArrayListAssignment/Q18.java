package ArrayListAssignment;

import java.util.ArrayList;

//18. Write a Java program to test an array list is empty or not.

public class Q18 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(100);
	ar.add(100);
	ar.add(100);
	ar.add(100);
	ar.clear();
	
	System.out.println(ar.isEmpty());
	
	
}
}
