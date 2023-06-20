package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

//Q5.Wap input an array and delete all duplicate element from array.

public class Q5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	int n=7;
	System.out.println("Enter Your Array List");
	for (int i = 0; i <=n; i++) {
		int a=sc.nextInt();
		
		ar.add(a);
		
	}
	
	Object []obj=ar.toArray();
	int b[]=new int[obj.length];
	int c=0;
	int v=-1;
	System.out.println("Delete Duplicate");
		for (int i = 0; i < obj.length; i++) {
			c=1;
		for (int j = i+1; j < obj.length; j++) {
			if(obj[i]==obj[j])
			{
				b[j]=v;
				c++;
			}
			
		}
		if(b[i]!=v)
		{
			b[i]=c;
			
		}
	}
		for (int i = 0; i < b.length; i++) {
			if(b[i]!=v)
			{
				System.out.println(obj[i]+" "+b[i]);
			}
		}
}
}
