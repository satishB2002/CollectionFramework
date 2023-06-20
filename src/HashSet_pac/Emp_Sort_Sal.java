package HashSet_pac;

import java.util.Comparator;

import Tree_Set.Salary_Info_Encapsulation;

public class Emp_Sort_Sal implements Comparator<Emp_Info_EnCapsulated_Class> {

	@Override
	public int compare(Emp_Info_EnCapsulated_Class o1, Emp_Info_EnCapsulated_Class o2) {
		
		return o1.getSalary().compareTo(o2.getSalary());
	}


}
