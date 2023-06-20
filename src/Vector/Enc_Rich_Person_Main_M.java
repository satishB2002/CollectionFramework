package Vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Enc_Rich_Person_Main_M {
public static void main(String[] args) {
	ArrayList<Enc_Rich_Person> ar=new ArrayList();
	ar.add(new Enc_Rich_Person("Jeff Bezos","New Mexico,U.S."));
	ar.add(new Enc_Rich_Person("Gautam Adani","India"));
	ar.add(new Enc_Rich_Person("Bill Gates","American"));
	ar.add(new Enc_Rich_Person("Warren Buffett","American"));
	ar.add(new Enc_Rich_Person("Larry Ellison","American"));
	System.out.println("Five Richest Person");
	System.out.println("   Name        \t Country");
	System.out.println("\t!!!Sort By Name ");
	Enc_Rich_Person_Name ss=new Enc_Rich_Person_Name();
	Collections.sort(ar, ss);
	Iterator itr=ar.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("\t!!!Sort By Country ");
	Enc_Rich_Person_Country ss1=new Enc_Rich_Person_Country();
	Collections.sort(ar, ss1);
	Iterator itr1=ar.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
}
}
