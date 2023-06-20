package Tree_Set;

import java.util.Comparator;
import java.util.Iterator;

public class Employee_Class_Id  implements Comparator<Employee_Encapsulated_Class>{

	@Override
	public int compare(Employee_Encapsulated_Class o1, Employee_Encapsulated_Class o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

	

}
