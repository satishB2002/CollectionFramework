package Weekly_Test_12_feb;

import java.util.ArrayList;
import java.util.Scanner;

/*7. WAP input an array now insert any element at any position , element and position is
taken by user using ArrayList.*/

public class Q7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> ar=new ArrayList();
	ar.add(11);
	ar.add(21);
	ar.add(31);
	ar.add(41);
	ar.add(51);
	ar.add(61);
	
	Object []obj=ar.toArray();
	System.out.println("Your Array");
	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
	System.out.println("Enter Your Element");
	int ele=sc.nextInt();
	System.out.println("Enter Your Position");
	int pos=sc.nextInt();
	for (int i = obj.length-1; i <=pos; i++) {
		obj[i]=obj[i-1];
	}
	obj[pos]=ele;
	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
}
}
