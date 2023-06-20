package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Scanner;
/*Q11.Given an array and a number K where K is smaller than 
 * the size of the array. Find the K’th smallest element in the
 *  given array. 
Given that all array elements are distinct.*/
public class Q11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	
	
	ar.add(7);
	ar.add(10);
	ar.add(4);
	ar.add(3);
	ar.add(20);
	ar.add(15);
	
	
	Object []obj=ar.toArray();
	int t=0;
	System.out.println("Enter K Ele");
	int k=sc.nextInt();
	
	for (int i = 0; i < obj.length; i++) {
	
		for (int j = i+1; j < obj.length; j++) {
			if((int )obj[i]>(int)obj[j])
			{
				t=(int) obj[i];
				obj[i]=obj[j];
				obj[j]=t;
				
			}
		}
		
	}
	System.out.println("K’th smallest element="+obj[k-1]);
	
}
}
