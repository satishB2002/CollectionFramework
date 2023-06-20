package Tree_Set;

import java.util.Comparator;

public class encaps_emp_info_sortByName implements Comparator<encaps_emp_info> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(encaps_emp_info o1, encaps_emp_info o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
