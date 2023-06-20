package Assignment_PAttern_Stream;
//Write a Java program to count and print all the duplicates in the input string

import java.util.Scanner;

public class count_Duplicate_print {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String Str=sc.nextLine();
	char a[]=Str.toCharArray();
	int b[]=new int[a.length];
	int i,j;
	int c=0;
	int v=-1;
	for ( i = 0; i < a.length; i++) {
		c=1;
		for ( j = i+1; j < a.length; j++) {
			if(a[i]==a[j])
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
	for ( i = 0; i < a.length; i++) {
		if(b[i]!=v)
		{
			System.out.println(a[i]+" "+b[i]);
		}
	}
}
}
