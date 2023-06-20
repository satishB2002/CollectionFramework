package garbageCollection;

import java.util.Comparator;

public class AA implements  Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer aInteger= (Integer)o1;
		Integer a1Integer= (Integer)o2;
		
		return a1Integer.compareTo(aInteger);
	}

	


}
