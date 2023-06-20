package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	ar.add(6);
	ar.add(7);
	Object []obj=ar.toArray();
	System.out.println("Enter You Want insert Element");
	int pos =sc.nextInt();
	for (int i =obj.length-1; i >=pos; i--) {
		obj[i]=obj[i+1];
	}

	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
	
}
}