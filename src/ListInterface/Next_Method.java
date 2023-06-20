package ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Next_Method {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(100);
	lk.add(200);
	lk.add(300);
	lk.add(400);
	
	ListIterator itr=lk.listIterator(lk.size());
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
}
}
