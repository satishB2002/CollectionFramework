package Vector;

import java.util.Comparator;

public class Emp_Details_Sort_Name implements Comparator<Encapsulation_Emp_Details>{

	@Override
	public int compare(Encapsulation_Emp_Details o1, Encapsulation_Emp_Details o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
