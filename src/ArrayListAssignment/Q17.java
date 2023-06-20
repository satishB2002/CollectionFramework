package ArrayListAssignment;
//17. Write a Java program to empty an array list. 

import java.util.ArrayList;

public class Q17 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	ar.add(5);
	ar.add(6);
	ar.clear();
	System.out.println(ar);
	
}
}
