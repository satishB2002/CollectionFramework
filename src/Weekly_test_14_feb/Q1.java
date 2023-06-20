package Weekly_test_14_feb;

import java.util.Arrays;

//Q1.Given two sorted arrays A and B of size p and q, write a Java program to merge
//elements of A with B by maintaining the sorted order i.e. fill A with first p smallest
//elements and fill B with remaining elements. Go to the editor
//
//Example:
//Input :
//int[] A = { 1, 5, 6, 7, 8, 10 }
//int[] B = { 2, 4, 9 }
//Output:
//Sorted Arrays:
//A: [1, 2, 4, 5, 6, 7]
//B: [8, 9, 10]

public class Q1 {
	
public static void main(String[] args) {
	int a[]= { 1, 5, 6, 7, 8, 10 };
	int b[]={ 2, 4, 9 };
	int c[]=new int[a.length+b.length];
	int i,j;
	for ( i = 0; i < a.length; i++) {
		c[i]=a[i];
		
	}
	for ( i = 0; i < b.length; i++) {
		c[a.length+i]=b[i];
		
	}
	
	
		Arrays.sort(c);
		
	/*for ( i = 0; i < c.length; i++) {
		System.out.println(c[i]+" ");
	}*/
		System.out.println("First Array");
	for ( i = 0; i < a.length; i++) {
		a[i]=c[i];
	}
	for ( i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	int v=0;
	System.out.println("Second Array");
	for ( i = a.length; i < c.length; i++) {
		b[v]=c[i];
		v++;
	}
	for ( i =0; i < b.length; i++) {
		System.out.println(b[i]);
		
	}
   }
	
	}


