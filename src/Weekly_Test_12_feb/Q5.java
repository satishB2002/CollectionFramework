package Weekly_Test_12_feb;

import java.util.Iterator;

/*5. Pattern.
1 2
2 4 8
3 6 12 24
4 8 16 32 64*/
public class Q5 
{
	 
public static void main(String[] args) 
{
	int m=0;
	for (int i = 1; i <=4; i++) 
	{
		m=1;
		for (int j = 0; j <=i; j++)
		{
			 
		
			  System.out.print(i*m+" ");
			  m=m*2;
		}
		System.out.println();
	}
			  
}
}
	
