package Encapsulation_Program;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_Enc_Class_main {

	public static void main(String[] args) {
		LinkedList<Linked_Enc_Class > ll=new LinkedList<Linked_Enc_Class >();
		ll.add(new Linked_Enc_Class ("Satish", 151,100000.0f));
		ll.add(new Linked_Enc_Class ("Barate", 121,200000.0f));
		ll.add(new Linked_Enc_Class ("Akole", 101,30000.0f));
		ll.add(new Linked_Enc_Class ("Nashik", 111,400000.0f));
		Collections.sort(ll, (a1,a2)->
		{
			return a1.getId().compareTo(a2.getId());
		});
		System.out.println("\t\t!!!Sort By Name!!!");
		System.out.println("Name\t\tID\t\tSalary");
		for (int i = 0; i <ll.size(); i++) {
			System.out.println(ll.get(i).getnAme()+"\t\t"+ll.get(i).getnAme()+"\t\t"+ll.get(i).getsAlary());
		}
		Collections.sort(ll, (a1,a2)->
		{
			return a1.getId().compareTo(a2.getId());
		});
		System.out.println("\t\t!!!Sort By ID!!!");
		System.out.println("Name\t\tID\t\tSalary");
		for (int i = 0; i <ll.size(); i++) {
			System.out.println(ll.get(i).getnAme()+"\t\t"+ll.get(i).getnAme()+"\t\t"+ll.get(i).getsAlary());
		}
		Collections.sort(ll, (a1,a2)->
		{
			return a1.getsAlary().compareTo(a2.getsAlary());
		});
		System.out.println("\t\t!!!Sort By Salary!!!");
		System.out.println("Name\t\tID\t\tSalary");
		for (int i = 0; i <ll.size(); i++) {
			System.out.println(ll.get(i).getnAme()+"\t\t"+ll.get(i).getnAme()+"\t\t"+ll.get(i).getsAlary());
		}
		
	}

}
