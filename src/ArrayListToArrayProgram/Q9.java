package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

//Q9. Write a Java program to compute the average value of an array of integers except the largest and smallest values.

public class Q9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	int n=10;
	System.out.println("Enter ArrayList");
	for (int i = 0; i <n; i++) {
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
	int max=(int) obj[obj.length-1];
	int min=(int) obj[0];
	int sum=max+min;
	System.out.println("Sum of Two No="+sum);
	double Avg=sum/2;
	System.out.println("Average of the largest and smallest values="	+ Avg);
}
}
