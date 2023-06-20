package ListInterface;

import java.util.ArrayList;

public class ListInterface {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();//creating old non-generic arraylist 
	ar.add(10);
	ar.add("Satish");
	ar.add(50.5f);
	ar.add(81.0);
	ar.add('s');
	ar.add(12000);
	ar.add(100);
	
	//Clear Method : Clear all  values
	//ar.clear();
	//System.out.println(ar);
	//Remove Method : remove perticular index
    //ar.remove(2);
	//System.out.println(ar);
	// get method
	//System.out.println(ar.get(2));
	// Contais Method
	//System.out.println(ar.contains(100));
	// index Method
	//System.out.println(ar.indexOf(100));
	// last index Method
	//System.out.println(ar.lastIndexOf(100));
	// size method
	//System.out.println(ar.size());
	//Clone Method
	System.out.println(ar.clone());
	
	
	
}
}
