package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

//Q3.Wap input an array and rotate it in anti clock wise by 
//any no give by user.
public class Q3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	System.out.println("Enter Your Array");
	for (int i = 0; i <5; i++) {
		int a=sc.nextInt();
		ar.add(a);
	}
	Object []arr=ar.toArray();
	
	
		int x=arr.length;
		
		for (int j=arr.length-2 ; j>=0; j--) {
			arr[j+1]=arr[j];
			
		}
		arr[0]=x;
		
	for (int j = 0; j< arr.length; j++) {
		System.out.println(arr[j]+" ");
	}
}
}
