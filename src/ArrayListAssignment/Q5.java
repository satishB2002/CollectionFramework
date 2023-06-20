package ArrayListAssignment;

import java.util.ArrayList;

//5. Write a Java program to update specific array element by given element. 

public class Q5 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(6);
	ar.add(7);
	ar.add(8);
	ar.add(9);
	ar.add(10);
	ar.add(11);
	ar.add(12);
	ar.add(13);
	ar.set(5, 21);
	System.out.println(ar);
}
}
