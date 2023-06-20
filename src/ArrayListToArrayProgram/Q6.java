package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	int n=6;
	System.out.println("Enter You ArrayList");
	for (int i = 0; i <=n; i++) {
		int a=sc.nextInt();
		ar.add(a);
		
	}
	
	Object []obj=ar.toArray();
	int t=0;
	int Max=0;
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
	System.out.println("Max No is="+obj[obj.length-1]);
}
}
