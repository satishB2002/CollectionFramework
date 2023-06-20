package Assignment_PAttern_Stream;
//Q14.Write a Java program to find maximum product of two integers in a given array of integers.
public class Q_3_Array_Max_Product {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,12,7,8,9};
	int i,j;
	int product=0;
	int max1=0;
	int max2=0;
	
	for (i = 0; i < a.length; i++) {
		for ( j = i+1; j < a.length; j++) {
			if(a[i]*a[j]>product)
			{
				product=a[i]*a[j];
				max1=a[i];
				max2=a[j];
			}
		}
	}
	System.out.println("Max1="+max1+" Max2="+max2);
	System.out.println("Max Product="+product);
}
}
