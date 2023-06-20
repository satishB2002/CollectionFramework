package Recursion;

public class Ex {
	public static void Printn(int i,int n)
	{
		
		if(i==21)
		{
			return ;
		}
		if (i%2!=0) {
			System.out.println(i+" ");
		} else {
			System.out.println(0-i+" ");

		}
		
	
		Printn( i+1, n);
		
		
	}
public static void main(String[] args) {
	int i=1,n=20;
	Ex.Printn(i, n);
}
}
