package ArrayListToArrayProgram;

import java.util.ArrayList;

//Q5. Write a Java program to print all the elements of a ArrayList using the position of the elements.

public class ArrayList_Print_Pos {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(100);
	ar.add(200);
	ar.add(300);
	ar.add(400);
	System.out.println(ar.get(0));
	System.out.println(ar.get(1));
	System.out.println(ar.get(2));
	System.out.println(ar.get(3));
}
}
