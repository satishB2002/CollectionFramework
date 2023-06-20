package Vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Enc_Emp_Det_Main {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(new Encapsulation_Emp_Details(151, "Satish", "Pune"));
	ar.add(new Encapsulation_Emp_Details(121, "onkar", "Mumbai"));
	ar.add(new Encapsulation_Emp_Details(111, "Sagar", "Nashik"));
	System.out.println("ID \t\tNAME \t\t CITY");
	System.out.println("\t  !!! Sort By ID !!");
	Emp_Details_Sort_Id  ss=new Emp_Details_Sort_Id ();
	Collections.sort(ar, ss);
	Iterator itr=ar.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("\t  !!!Sort By Name !!!");
	Emp_Details_Sort_Name ss1=new Emp_Details_Sort_Name();
	Collections.sort(ar, ss1);
	Iterator itr1=ar.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	System.out.println("\t  !!!Sort By City");
	Emp_Details_Sort_City ss2=new Emp_Details_Sort_City();
	Collections.sort(ar, ss2);
	Iterator itr2=ar.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
	}
}
}
