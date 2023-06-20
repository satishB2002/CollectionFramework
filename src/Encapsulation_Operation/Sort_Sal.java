package Encapsulation_Operation;

import java.util.Comparator;

public class Sort_Sal implements Comparator<Encapsulation_class_Data>{

	@Override
	public int compare(Encapsulation_class_Data o1, Encapsulation_class_Data o2) {
		// TODO Auto-generated method stub
		return o1.getSal().compareTo(o2.getSal());
	}

}
