package Queqe_Interface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
class Emp1 implements Comparator<Encapsulation_Emp>{

	@Override
	public int compare(Encapsulation_Emp o1, Encapsulation_Emp o2) {
		// TODO Auto-generated method stub
		return o1.getSal().compareTo(o2.getSal());
	}
	
}
public class Ex_Iterator 
{
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue(new Emp1());
	pq.add(new Encapsulation_Emp(11,"Abv",1478.1));
	pq.add(new Encapsulation_Emp(18,"Xyz",1978.1));
	pq.add(new Encapsulation_Emp(12,"Mnp",1678.1));
	System.out.println(pq);
	
	
	
	
	
}


}
