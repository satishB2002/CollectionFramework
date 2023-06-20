package Vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Employee_Comprable_Main {
public static void main(String[] args) {
	Employee_Comprable ss=new Employee_Comprable(100,"Satish", 100.00);
	Employee_Comprable ss1=new Employee_Comprable(111,"ABC", 50000.00);
	Employee_Comprable ss2=new Employee_Comprable(151,"XYZ", 1000.00);
	LinkedList ar=new LinkedList();
	ar.add(ss);
	ar.add(ss1);
	ar.add(ss2);
	
	Collections.sort(ar);
	System.out.println(ar);
}
}
