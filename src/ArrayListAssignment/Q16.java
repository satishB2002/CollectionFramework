package ArrayListAssignment;
//16. Write a Java program to clone an array list to another array list. 

import java.util.ArrayList;

public class Q16 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add("Satish");
	ar.add("satish 1");
	ar.add("Satish 2");
	ar.add("Satish 3");
	
	System.out.println(ar.clone());
	
}

}
