package HashSet_pac;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import LamdaExpression.Enc_Class_Lamda_Exp;

public class Emp_main_class {
public static void main(String[] args) {
	
	HashSet hs=new HashSet();
	hs.add(new Emp_Info_EnCapsulated_Class(11,"DFG",1234.00));
	hs.add(new Emp_Info_EnCapsulated_Class(12,"Dokl",12789.00));
	hs.add(new Emp_Info_EnCapsulated_Class(10,"DPLG",15224.00));
	hs.add(new Emp_Info_EnCapsulated_Class(16,"JIG",1255.00));
	hs.add(new Emp_Info_EnCapsulated_Class(17,"TGG",1159.00));
	System.out.println("ID\tName\tSalary");
	hs.stream().sorted(new Emp_Sort_Sal()).forEach(n->System.out.println(n));
	
	
	
	
}
}
