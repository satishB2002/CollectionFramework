package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

//Q3.Wap input an array and rotate it in anti clock wise by any no give by user.

public class Q2 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	Scanner sc=new Scanner(System.in);
	int size=5;
	System.out.println("Enter ArrayList");
	for (int i = 0; i < size; i++) {
		int a=sc.nextInt();
		ar.add(a);
		
	}
	Object []obj=ar.toArray();
	System.out.println("Your Array");
	for (int i = 0; i < obj.length; i++) {
		System.out.print(obj[i]+" ");
	}
	System.out.println();
	int x;
	System.out.println("Your Anticlockwise Array");
	x=(int) obj[0];
	for (int i = 1; i < obj.length; i++) {
		obj[i-1]=obj[i];
		
	}
	obj[obj.length-1]=x;
	for (int i = 0; i < obj.length; i++) {
		System.out.print(obj[i]+" ");
	}
}
}
