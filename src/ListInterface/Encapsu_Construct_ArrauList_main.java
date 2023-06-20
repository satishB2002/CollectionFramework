package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;


public class Encapsu_Construct_ArrauList_main {
public static void main(String[] args) {
	//Encapsu_Construct_ArrauList ss=new Encapsu_Construct_ArrauList(11,"Satish", 100000);
	//Encapsu_Construct_ArrauList ss1=new Encapsu_Construct_ArrauList(11,"Sagar", 200000);
	//Encapsu_Construct_ArrauList ss2=new Encapsu_Construct_ArrauList(11,"Tejas", 300000);
	ArrayList ar=new ArrayList();
	ar.add(new Encapsu_Construct_ArrauList(11,"Satish", 100000));
	ar.add(new Encapsu_Construct_ArrauList(16,"Sagar", 200000));
	ar.add(new Encapsu_Construct_ArrauList(12,"Tejas", 300000));
	
	Iterator itr =ar.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
