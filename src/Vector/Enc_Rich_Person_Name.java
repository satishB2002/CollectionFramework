package Vector;

import java.util.Comparator;

public class Enc_Rich_Person_Name implements Comparator<Enc_Rich_Person>{

	@Override
	public int compare(Enc_Rich_Person o1, Enc_Rich_Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	

}
