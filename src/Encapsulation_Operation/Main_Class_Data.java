package Encapsulation_Operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import HashSet_pac.Emp_Info_EnCapsulated_Class;
import HashSet_pac.Emp_Sort_Sal;
import LamdaExpression.foreachMethod;

public class Main_Class_Data {
public static void main(String[] args) {
	 Sort_Sal sb =new  Sort_Sal();
	ArrayList ar=new ArrayList();
	ar.add(new  Encapsulation_class_Data (111,"Satish",1234.00));
	ar.add(new  Encapsulation_class_Data (116,"Xyd",1854.00));
	ar.add(new  Encapsulation_class_Data (117,"SLkh",1954.00));
	ar.add(new  Encapsulation_class_Data (118,"GKYH",1354.00));
	
	
	ArrayList< Double> ar2=new ArrayList<>();
	ar2.add(1234.00);
	ar2.add(25000.00);
	ar2.add(15000.00);
	
	
	
	//ar.stream().sorted(new Sort_Sal ()).forEach(n->System.out.println(n));
	Collections.sort(ar, sb );
	Iterator itr =ar.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	Double sum=0.0;
	
	
	
	Double avg;
	for (int i = 0; i < ar.size(); i++) {
		//Double sum ;
		sum = sum + ar2.get(i);  
		//finds the average of the list  
		avg = sum / ar2.size();  
		
		System.out.println("Average ="+avg);
		
	}
	
}
}
