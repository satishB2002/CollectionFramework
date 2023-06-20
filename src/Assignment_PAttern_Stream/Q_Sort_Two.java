package Assignment_PAttern_Stream;
/*
Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. 
fill A with first p smallest elements and fill B with remaining elements.
Example:
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]
*/
public class Q_Sort_Two {
public static void main(String[] args) {
	int A[]={ 1, 5, 6, 7, 8, 10 };
	int B[]={ 2, 4, 9 };
	int size=A.length+B.length;
	int C[]=new int[size];
	int i,j,t=0;
	for ( i = 0; i < A.length; i++) {
		C[i]=A[i];
	}
	for ( i = 0; i < B.length; i++) {
		C[i+A.length]=B[i];
	}
	for ( i = 0; i < C.length; i++) {
		for (j  = i+1; j < C.length;j++) {
			if(C[i]>C[j])
			{
				t=C[i];
				C[i]=C[j];
				C[j]=t;
			}
		}
	}
	System.out.println("Array A:");
	for(i=0; i<A.length; i++)
	{
		System.out.print(" "+C[i]);
	}
	System.out.print("\nArray B= ");
	for(i=A.length; i<C.length; i++)
	{
		System.out.print(" "+C[i]);
	}
}
}
