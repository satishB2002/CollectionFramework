package LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import ListInterface.get_Method;

public class Enc_fight_Main {
public static void main(String[] args) {
	ArrayList<Enc_fight> ar =new ArrayList<Enc_fight>();
	ar.add(new Enc_fight("Satish",91,6500.0));
	ar.add(new Enc_fight("Shubham",21,6200.0));
	ar.add(new Enc_fight("Pravin",11,6300.0));
	System.out.println("\t\tSort Name");
	Collections.sort(ar,(a1,a2)->
	{
		return a1.getName().compareTo(a2.getName());
	});
	for (int i = 0; i <ar.size(); i++) {
		System.out.println(ar.get(i).getName()+" "+ar.get(i).getId()+" "+ar.get(i).getSal());
	}
	System.out.println("\t\tSort Id");
	Collections.sort(ar,(a1,a2)->
	{
		return a1.getId().compareTo(a2.getId());
	});
	for (int i = 0; i <ar.size(); i++) {
		System.out.println(ar.get(i).getName()+" "+ar.get(i).getId()+" "+ar.get(i).getSal());
	}
	System.out.println("\t\tSort Sal");
	Collections.sort(ar,(a1,a2)->
	{
		return a1.getSal().compareTo(a2.getSal());
	});
	for (Enc_fight ab : ar) {
		System.out.println(ab.getName()+" "+ab.getId()+" "+ab.getSal());
	}
}
}
