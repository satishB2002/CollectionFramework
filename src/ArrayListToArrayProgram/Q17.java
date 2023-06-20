package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Q17.An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples : 
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5*/
public class Q17 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	ar.add(-12);
	ar.add(11);
	ar.add(-13);
	ar.add(-5);
	ar.add(6);
	ar.add(-7);
	ar.add(5);
	ar.add(-3);
	ar.add(-6);
	//Collections.shuffle(ar);
	//System.out.println(ar);
	Object []obj=ar.toArray();
	int t=0;
	for (int i = 0; i < obj.length; i++) {
		for (int j = 0; j < obj.length; j++) {
			if((int)obj[i]<(int)obj[j])
			{
				t=(int) obj[i];
				obj[i]=obj[j];
				obj[j]=t;
			}
		}
	}
	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
	
}
}
