package ArrayListAssignment;

import java.util.ArrayList;

//19. Write a Java program to trim the capacity of an array list the current list size. 

public class Q19 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(100);
	ar.add(101);
	ar.add(102);
	ar.add(103);
	ar.add(104);
	ar.trimToSize();
	ar.add(166);
	ar.trimToSize();
	System.out.println(ar);
	System.out.println(ar.size());	
}
}
