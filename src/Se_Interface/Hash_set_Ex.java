package Se_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;



public class Hash_set_Ex {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	//System.out.println(hs);
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

	
}
}
