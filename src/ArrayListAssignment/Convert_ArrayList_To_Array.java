package ArrayListAssignment;

import java.util.ArrayList;
import java.util.LinkedList;

import Weekly_test_14_feb.newthread;

public class Convert_ArrayList_To_Array {
public static void main(String[] args) {
	ArrayList< Integer> arrayList=new ArrayList<>();
	arrayList.add(0,54);
	arrayList.add(1,54);
	arrayList.add(2,65);
	System.out.println(arrayList);
	LinkedList< Integer> LK=new LinkedList();
	LK.add(0,54);
	LK.add(1,54);
	LK.add(2,65);
	System.out.println(LK );
	Object [] obj	=arrayList.toArray();
	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
}
}
