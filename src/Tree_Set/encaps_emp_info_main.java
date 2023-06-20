package Tree_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class encaps_emp_info_main {

	public static void main(String[] args) {
		encaps_emp_info_sortByName obj=new encaps_emp_info_sortByName();
		TreeSet ts=new TreeSet(obj);
		
		ts.add(new encaps_emp_info("vipul"));
		ts.add(new encaps_emp_info("akshay"));
		ts.add(new encaps_emp_info("pravin"));
		ts.add(new encaps_emp_info("hrutik"));

		Iterator itr =ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
