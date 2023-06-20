package LamdaExpression;

import java.util.Scanner;

public class Thread_Lamda_Ex {
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		Runnable k=()->
		{
			
			
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]+" ");
			}
			System.out.println(Thread.currentThread().getName());
		};
		Thread ok=new Thread(k);
		ok.start();
		ok.setName("satish");
		Thread ok1=new Thread(k);
		ok1.start();
		ok1.setName("s2");
	}
	
}
