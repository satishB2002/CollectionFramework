package Tree_Set;

import java.util.Comparator;

public class Salary_Info_Encapsulation_Sort_Salary implements Comparator<Salary_Info_Encapsulation> {

	@Override
	public int compare(Salary_Info_Encapsulation o1, Salary_Info_Encapsulation o2) {
		// TODO Auto-generated method stub
		return o1.getSalary().compareTo(o2.getSalary());
	}

}
