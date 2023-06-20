package ArrayListAssignment;

import java.util.ArrayList;

//22. Write a Java program to print all the elements of a ArrayList using the position of the elements. 

public class Q22 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(12);
	ar.add(13);
	ar.add("Barate");
	ar.add('S');
	ar.add('#');
	for (int i = 0; i < ar.size(); i++) {
		System.out.println(ar.get(i));
	}

	
	
}
}
