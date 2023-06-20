package ListInterface;

import java.util.LinkedList;

public class Clear_Method {
public static void main(String[] args) {
	LinkedList lk=new LinkedList();
	lk.add(33);
	lk.add(34);
	lk.add(35);
	lk.add(36);
	//lk.clear();
	//lk.indexOf(3);
	//System.out.println(lk.indexOf(3));
	//Object []a=lk.toArray();
	//for (int i = 0; i < a.length; i++) {
	//	System.out.println(a[i]);
	//}
   //lk.listIterator(2);
	//lk.spliterator();
	//System.out.println(lk);
	lk.sort(null);
	System.out.println(lk);
}
}
