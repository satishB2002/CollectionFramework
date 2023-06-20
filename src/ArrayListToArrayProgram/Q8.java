package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

//Q8. Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 2 and above.

public class Q8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	int n=7;
	System.out.println("Enter Your ArrayList");
	for (int i = 0; i <=n; i++) {
		int a=sc.nextInt();
		ar.add(a);
	}
	Object []obj=ar.toArray();
	int t=0;
	for (int i = 0; i < obj.length; i++) {
		for (int j = 0; j < obj.length; j++) {
			if((int)obj[i]<(int)obj[j])
			{
				t=(int) obj[i];
				obj[i]=obj[j];
				obj[j]=t;
			}
		}
	}
	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
	int G=(int) obj[obj.length-1];
	int S=(int) obj[0];
	int Diff=G-S;
	System.out.println("Differnce Between Smallest And Greatest="+Diff);
	
}


}

