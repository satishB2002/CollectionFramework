package Recursion;
//Q3.Write a Java program to calculate the power of a number like power(int number, int power)
//like power(2, 3) should return 8?
public class powerofnumber {
	public static int powernumber(int num,int power)
	{
		
		return (int) Math.pow(num, power);

	}
public static void main(String[] args) {
	
	int ans= powernumber(2,3);
	System.out.println(ans);
}
}
