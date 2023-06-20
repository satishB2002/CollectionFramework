package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collection;

//8. Write a Java program to sort a given array list.

public class Q8 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(1);
	ar.add(99);
	ar.add(33);
	ar.add(77);
	ar.add(22);
	ar.add(88);
	ar.add(64);
	ar.add(115);
	ar.add(458);
	ar.add(159);
	
	ar.sort(null);
	System.out.println(ar);
	
}
}
