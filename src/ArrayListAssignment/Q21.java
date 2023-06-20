package ArrayListAssignment;

import java.util.ArrayList;

//21. Write a Java program to replace the second element of a ArrayList with the specified element. 

public class Q21 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(100);
	ar.add(200);
	ar.add(300);
	ar.add(400);
	ar.add(500);
	ar.set(2,"Satish");
	System.out.println(ar);
	
}
}
