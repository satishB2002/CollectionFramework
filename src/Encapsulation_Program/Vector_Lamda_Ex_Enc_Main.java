package Encapsulation_Program;

import java.util.Collections;
import java.util.Vector;

public class Vector_Lamda_Ex_Enc_Main {
public static void main(String[] args) {
	Vector<Vector_Lamda_Ex_Enc>vc=new Vector<Vector_Lamda_Ex_Enc>();
	vc.add(new Vector_Lamda_Ex_Enc('J', 852,8564.03f));
	vc.add(new Vector_Lamda_Ex_Enc('D', 856,76543.0f));
	vc.add(new Vector_Lamda_Ex_Enc('O', 654,45612.002f));
	Collections.sort(vc, (a1,a2)->
	{
		return a1.getFirstL().compareTo(a2.getFirstL());
	});
	System.out.println("\t\t%% Sort By Character %%");
	System.out.println("Character\t Id\t     Salary");
	System.out.println("-0-0-0-\t\t-0-0-0-\t\t-0-0-0-");
	for (int i = 0; i < vc.size(); i++) {
		System.out.println(vc.get(i).getFirstL()+"\t\t"+vc.get(i).getId()+"\t\t"+vc.get(i).getSSS());
	}
	Collections.sort(vc, (a1,a2)->
	{
		return a1.getId().compareTo(a2.getId());
	});
	System.out.println("\t\t%% Sort By ID %%");
	System.out.println("Character\t Id\t     Salary");
	System.out.println("-0-0-0-\t\t-0-0-0-\t\t-0-0-0-");
	for (int i = 0; i < vc.size(); i++) {
		System.out.println(vc.get(i).getFirstL()+"\t\t"+vc.get(i).getId()+"\t\t"+vc.get(i).getSSS());
	}
	Collections.sort(vc, (a1,a2)->
	{
		return a1.getSSS().compareTo(a2.getSSS());
	});
	System.out.println("\t\t%% Sort By Salary %%");
	System.out.println("Character\t Id\t     Salary");
	System.out.println("-0-0-0-\t\t-0-0-0-\t\t-0-0-0-");
	for (int i = 0; i < vc.size(); i++) {
		System.out.println(vc.get(i).getFirstL()+"\t\t"+vc.get(i).getId()+"\t\t"+vc.get(i).getSSS());
	}
}
}
