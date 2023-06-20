package Weekly_Test_12_feb;

import java.util.HashSet;

/*10. . Write a Java program to compare two sets and retain elements which are same on
both sets using HashSet
*/
public class Q10 {
public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet();
	hs.add(11);
	hs.add(21);
	hs.add(19);
	hs.add(31);
	hs.add(17);
	hs.add(41);
	HashSet<Integer> hs1=new HashSet();
	hs1.add(89);
	hs1.add(69);
	hs1.add(19);
	hs1.add(85);
	hs1.add(17);
	hs1.add(71);
	Object a[]=hs.toArray();
	Object b[]=hs1.toArray();
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[i])
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
	
}
}
