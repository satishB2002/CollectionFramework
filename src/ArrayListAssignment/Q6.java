package ArrayListAssignment;

import java.util.ArrayList;

//6. Write a Java program to remove the third element from a array list. 

public class Q6 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(11);
	ar.add(12);
	ar.add(13);
	ar.add(14);
	ar.add(15);
	ar.add(16);
	ar.add(17);
	ar.add(18);
	ar.add(19);
	ar.add(20);
	ar.remove(2);
	System.out.println(ar);
}
}
