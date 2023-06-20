import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import HashSet_pac.Enc_Emp_Class;

public class Enc_Emp_Class_Main {
public static void main(String[] args) {
	HashSet hs =new HashSet();
	hs.add(new Enc_Emp_Class (221,"Satish",19454.0));
	hs.add(new Enc_Emp_Class (121,"Shubham",8534.0));
	hs.add(new Enc_Emp_Class (131,"Pravin",15634.0));
	ArrayList ar=new ArrayList(hs);
	Collections.sort(ar);
	
	Iterator itr =ar.iterator() ;
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	};
}
}
