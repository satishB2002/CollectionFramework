package ListInterface;

import java.util.ArrayList;

public class ArrayList_Clockwise {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	ar.add(5);
	ArrayList<Integer> as=new ArrayList<Integer>();
	Object [] a=ar.toArray();
	int x;
	System.out.println("Your Array");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println("Your Clockwise Array");
	x=a.length;
	for (int i =a.length-2; i>=0; i--) {
		a[i+1]=a[i];
		
	}
	a[0]=x;
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	
}
}
