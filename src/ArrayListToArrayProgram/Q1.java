//Q1.Wap input an array now delete  
//element from array, element is taken from user.
package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//Q1.Wap input an array now delete  element from array, element is taken from user.
public class Q1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	int size=7;
	System.out.println("Enter Array List ");
	for (int i = 0; i <size; i++) {
		int a=sc.nextInt();
	       ar.add(a);
	}
	Object []obj=ar.toArray();
	System.out.println("Your Array");
	for (int i = 0; i <obj.length; i++) {
		
		System.out.println(obj[i]+" ");
	}
	System.out.println("Enter You Want Delete Element");
	int ele =sc.nextInt();
	for (int i =ele-1; i <obj.length-1; i++) {
		
		obj[i]=obj[i+1];
	}
	
	for (int i = 0; i <obj.length; i++) {
		
		System.out.println(obj[i]+" ");
	}
	
	
	
}
}
