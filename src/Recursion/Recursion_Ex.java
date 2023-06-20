package Recursion;

public class Recursion_Ex {
	public static void Printn(int i,int n,int sum)
	{
		
		if(i==n)
		{
			sum=sum+i;
			System.out.print(sum);
			return;
		}
		sum=sum+i;
	
		Printn(i+1, n, sum);
		
		
	}
public static void main(String[] args) {
	int i=1;
	 Printn(1,5,0);
}
}
