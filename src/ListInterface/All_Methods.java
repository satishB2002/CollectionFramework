package ListInterface;

import java.util.ArrayList;

public class All_Methods {

public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	// ensuere capacity it is used to enhance capacity
	ar.ensureCapacity(100);
	ar.add(1000);
	ar.add(101);
	ar.add(102);
	ar.add(103);
	ar.add(104);
	ar.add(105);
	ar.add(106);
	ar.add(107);
	ar.add(108);
	//trim to size
	//ar.trimToSize();
	// add to isert the specified position in a list
	//ar.add(2,211);
	//System.out.println(ar);
	//add It is used to append the specific element at the end oh the list
	
	//ar.add(1000);
	//System.out.println(ar);
	//void clear It is the use of the remove all elements
	//ar.clear();
	//System.out.println(ar);
	//get method it is used fetch element
	
	//System.out.println(ar.get(5));
	//is Empty method it is used check list
	//System.out.println(ar.isEmpty());
	//int last index it is use return the index in this of the last occurance
	//System.out.println(ar.lastIndexOf(ar));
	//to array method it used to array containing all elements in this correct order
	//ar.toArray();
	//System.out.println(ar);
	//Object Clone () it is return shallow copy of an ArrayList
	//System.out.println(ar.clone());
	//Boolean Contains it returns Specified element
	
	//System.out.println(ar.contains(8));
	//indexOf() it is used to return index
	//System.out.println(ar.indexOf(10));
	//System.out.println(ar.remove(2));
	//removeAll() it is used to remove All elements
	//System.out.println(ar.removeAll(ar));	
	// size () it is used elements the present list
	//ar.spliterator();
	//System.out.println(ar);
	ar.sort(null);
	System.out.println(ar);
	
	
}
}
