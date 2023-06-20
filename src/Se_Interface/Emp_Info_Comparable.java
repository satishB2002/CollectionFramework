package Se_Interface;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/*Q1.
WAP to store employee information in hashset like id,name,salary sort the employee by salary using comparable.*/
public class Emp_Info_Comparable {
public static void main(String[] args) {
	
	HashSet hs=new HashSet();
	
	hs.add(new Enc_Emp_Info_Comparable(111,"Abc",14563.2));
	hs.add(new Enc_Emp_Info_Comparable(121,"Xyz",14563.3));
	hs.add(new Enc_Emp_Info_Comparable(151,"Lmn",14563.1));
	System.out.println("\tID");
	//System.out.println(hs);
	
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
