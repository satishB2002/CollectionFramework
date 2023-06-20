package ArrayListAssignment;

import java.util.ArrayList;

//9. Write a Java program to copy one array list into another. 

public class Q9 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(1);
	ar.add(5);
	ar.add(6);
	ar.add(7);
	ar.add(8);
	ArrayList ar1=new ArrayList(ar);
	ar1.add(100);
	ar1.add(200);
	System.out.println(ar1);
	
}
}
