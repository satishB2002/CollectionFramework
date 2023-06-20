package Tree_Set;

import java.util.Comparator;

public class Employee_Class_Name implements Comparator<Employee_Encapsulated_Class>{

	@Override
	public int compare(Employee_Encapsulated_Class o1, Employee_Encapsulated_Class o2) {
		// TODO Auto-generated method stub
		return o1.getStr().compareTo(o2.getStr());
	}

	

}
