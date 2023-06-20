package ArrayListAssignment;

import java.util.ArrayList;

//20. Write a Java program to increase the size of an array list. 

public class Q20 {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.ensureCapacity(5);
		ar.add(144);
		ar.add(145);
		ar.add(146);
		ar.add(147);
		ar.add(148);
		ar.add(149);
		System.out.println(ar);
		
	}

}
