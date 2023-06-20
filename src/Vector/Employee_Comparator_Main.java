package Vector;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Vector;

public class Employee_Comparator_Main {
public static void main(String[] args) {
	Employee_Comparator ss=new Employee_Comparator(111, "Satish", 1478.21);
	Employee_Comparator ss1=new Employee_Comparator(121, "ABC", 141598.21);
	Employee_Comparator ss2=new Employee_Comparator(111, "XYZ", 19978.21);
	Vector ar=new Vector();
	ar.add(ss);
	ar.add(ss1);
	ar.add(ss2);
	Collections.sort(ar);
	System.out.println(ar);
	
}
}
