package Assignment_PAttern_Stream;

import java.util.HashSet;
import java.util.Iterator;

/*2 :Write a program to traverse(or iterate) HashSet? 
		   All data comes from encapsulated , 
		   Student name , course , class
*/
public class Q11 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(new  Q_11_Enc("HYB","Java",12));
	hs.add(new  Q_11_Enc("ERT","javascript",17));
	hs.add(new  Q_11_Enc("POI","python",63));
	Iterator itr=hs.iterator();
	System.out.println("Name\tCourse\tStandard");
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
