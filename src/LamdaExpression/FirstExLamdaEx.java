package LamdaExpression;

import java.util.Scanner;

interface abc
{
	void disp();
	void Input();
}
public class FirstExLamdaEx 
{
	
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	 abc ab=new abc()
			 {
int i;
int a[]=new int[5];		
				public void disp()
				{
					System.out.println("Enter Array");
					
					for ( i = 0; i < a.length; i++) {
						a[i]=sc.nextInt();
					}
					
				}

				
				public void Input() 
				{
					System.out.println("Your  Array");
					
					for (i = 0; i < a.length; i++) {
						System.out.println(a[i]);
					}
					
				}
			 };
				ab.disp();
				ab.Input();
		 
			 
			 
}
}

