package Weekly_test_14_feb;

import java.util.Collections;

//1. Create a program that asks user to input their full name. The created program must
//create the below output
//Example Input-Yash Babrekar
//a) Unique characters of the name entered. Example For Yash Babrekar, unique
//characters are -y, a, s , h , b, r, e, k
//b) Count of unique characters in the name. For Yash Babrekar, count of unique
//characters y = 1 a = 3 s = 1 b = 2 r = 2 e = 1, k = 1
//c) Sorting the unique characters in alphabetical order. For Yash Babrekar, sorted
//unique characters are a, b, e, h, k, r, s, y

public class Q_test_freq {
public static void main(String[] args) {
	String Str="Yash Babrekar";
	
	String s=Str.toLowerCase();
	char a[]=s.toCharArray();
	int b[]=new int[a.length];
	int c=0,v=-1;
	int i,j;
	for ( i = 0; i < a.length; i++) {
		c=1;
		for (j = i+1; j <b.length; j++) {
			
			if(a[i]==a[j])
			{
				b[j]=v;
				c++;
				
			}
			
		}
		if(b[i]!=v)
			b[i]=c;
	}
	
	for ( i = 0; i < b.length; i++) {
		if(b[i]!=v)
		{
			if(a[i]!=' ')
			{
				
				
			System.out.println(a[i]+" "+b[i]);
			}
		}

	}
	
	
}
}
