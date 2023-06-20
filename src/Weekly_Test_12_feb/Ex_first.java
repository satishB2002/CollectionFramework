package Weekly_Test_12_feb;
/*1. Write a Java method to develop a Java method for extracting the first digit from a
positive or negative integer.
Expected Output:
Input an integer(positive/negative): 1234
Extract the first digit from the said integer: 1*/

public class Ex_first {
public static void main(String[] args) {
	int n=1234;
	int rem;
	int i,j;
	int t=n;
	int first=0;
	while(t!=0)
	{
		rem=t%10;
		System.out.println(rem);
		t=t/10;
	}

}
}
