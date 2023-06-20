package LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Enc_Class_Lamda_Exp_Main {
public static void main(String[] args) {
	ArrayList<Enc_Class_Lamda_Exp> ar=new ArrayList<Enc_Class_Lamda_Exp>();
	ar.add(new Enc_Class_Lamda_Exp("ZBCD","111",51000));
	ar.add(new Enc_Class_Lamda_Exp("POIU","511",25000));
	ar.add(new Enc_Class_Lamda_Exp("RAHM","211",35000));
	System.out.println("\t\t!!! Sort By Name !!!");
	ar.sort(Comparator.comparing(Enc_Class_Lamda_Exp::getName));
	System.out.println("Name\t\tID\t\tSalary");
	System.out.println("=====\t\t=====\t\t=====");
	for (int i = 0; i <ar.size(); i++) {
		System.out.println(ar.get(i).getName()+"\t\t"+ar.get(i).getId()+"\t\t"+ar.get(i).getSal());
	}
	System.out.println("\t\t!!!Sort By ID!!!");
	ar.sort(Comparator.comparing(Enc_Class_Lamda_Exp::getId));
	System.out.println("Name\t\tID\t\tSalary");
	System.out.println("=====\t\t=====\t\t=====");
	for (int i = 0; i <ar.size(); i++) {
		System.out.println(ar.get(i).getName()+"\t\t"+ar.get(i).getId()+"\t\t"+ar.get(i).getSal());
	}
	System.out.println("\t\t!!!Sort By Salary!!!");
	ar.sort(Comparator.comparing(Enc_Class_Lamda_Exp::getSal));
	System.out.println("Name\t\tID\t\tSalary");
	System.out.println("=====\t\t=====\t\t=====");
	for (int i = 0; i <ar.size(); i++) {
		System.out.println(ar.get(i).getName()+"\t\t"+ar.get(i).getId()+"\t\t"+ar.get(i).getSal());
	}
	Collections.sort(ar,(a1,a2)->{
		return a1.getName().compareTo(a2.getName());
	});
	System.out.println("Sort By Name L");
	System.out.println("Name\t\tID\t\tSalary");
	System.out.println("=====\t\t=====\t\t=====");
	for (int i = 0; i <ar.size(); i++) {
		System.out.println(ar.get(i).getName()+"\t\t"+ar.get(i).getId()+"\t\t"+ar.get(i).getSal());
	}
}
}
