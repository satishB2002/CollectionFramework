package Tree_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Salary_Info_Encapsulation_Main {

	public static void main(String[] args) {
		 Salary_Info_Encapsulation_Sort_Salary obj=new  Salary_Info_Encapsulation_Sort_Salary();
		TreeSet ts=new TreeSet(obj);
		ts.add(new Salary_Info_Encapsulation(12345.00));
		ts.add(new Salary_Info_Encapsulation(74145.00));
		ts.add(new Salary_Info_Encapsulation(85245.00));
		ts.add(new Salary_Info_Encapsulation(96345.00));
		Iterator itr=ts.iterator();
		System.out.println("Sorted Salary");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
