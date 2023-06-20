package Tree_Set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Employee_Enc_MainClass {
public static void main(String[] args) {
	Employee_Class_Id ob=new Employee_Class_Id ();
	TreeSet ts=new TreeSet(ob);
	ts.add(new Employee_Encapsulated_Class(151,"Abc", 1478.2));
	ts.add(new Employee_Encapsulated_Class(141,"Xyz", 5278.2));
	ts.add(new Employee_Encapsulated_Class(131,"Lmn", 1178.2));
	System.out.println("\t\tSort By ID");
	System.out.println("ID\t\tName\t\tSalary");
	Iterator itr=ts.iterator(); 
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
