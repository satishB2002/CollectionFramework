package ArrayListToArrayProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//1] Employee in arraylist and sort and print through iterator or for each loop
public class ArrayListsorting {
public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	al.add("Satish");
	al.add("SVGHVGH");
	al.add("GYGYU");
	al.add("yuhilh");
	al.add("hjbh,h");
	Collections.sort(al);
	Iterator itr =al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	for (Object object : al) {
		
	}
	System.out.println(al);
}
}
