package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

//2. Write a Java program to iterate through all elements in a array list. 

public class Q2 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add("50");
	ar.add("40");
	ar.add("30");
	ar.add("50");
	ar.add("60");
	ar.add("70");
	ar.add("80");
	ar.add("90");
	ar.add("100");
	Iterator itr=ar.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
