package Weekly_Test_12_feb;

import java.util.Scanner;

/*2. WAP to check if an array of integers contains two specified elements. Do it using
Abstraction.*/
 abstract class H
{
	abstract void input();
}
public class Q2 extends H{
Scanner sc=new Scanner(System.in);
	@Override
	void input() {
		int a[]= {1,5,6,7,8,9,14};
		System.out.println("Your Array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Search First Element");
		int ele=sc.nextInt();
		System.out.println("Search Second Element");
		int ele2=sc.nextInt();
		for (int i = 0; i < a.length; i++) {
		
			if(a[i]==ele)
			{
				System.out.println("First Element Are  Found");
				break;
		     }
			else if(a[i]==ele2)
			{
				System.out.println("Second Element Are Found");
				break;
			}
			else if(a[i]==ele && a[i]==ele2) 
			{
				System.out.println("Both Element Are Found");
				break;
			}
			else 
			{
				System.out.println("Both Element Are Not Found");
				break;
			}
			
				
		}	 
		
	}
	public static void main(String[] args) {
		Q2 ss=new Q2();
		ss.input();
	}

}
