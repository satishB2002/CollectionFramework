package LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_Lamda_Enc_Main {

	
	public static void main(String[] args) {
	
ArrayList<Sorting_Lamda_Enc> ar=new ArrayList<Sorting_Lamda_Enc>();
ar.add(new Sorting_Lamda_Enc("saTish", 'V', 5500.0));
ar.add(new Sorting_Lamda_Enc("Barate", 'L', 55600.0));
ar.add(new Sorting_Lamda_Enc("pUne", 'R', 55450.0));
Collections.sort(ar,(a1,a2)->
{
	return a1.getName().compareTo(a2.getName());
});
System.out.println("\t\t!!!Sort By Name");
System.out.println("Name\t\tID\t\tSalary");
System.out.println("=====\t\t=====\t\t=======");
for (int i = 0; i <ar.size(); i++) {
	System.out.println(ar.get(i).getName()+"\t\t"+ar.get(i).getId()+"\t\t"+ar.get(i).getSaL());
}
Collections.sort(ar,(a1,a2)->
{
	return a1.getId().compareTo(a2.getId());
});
System.out.println("\t\t!!!Sort By Id");
System.out.println("Name\t\tID\t\tSalary");
System.out.println("=====\t\t=====\t\t=======");
for (int i = 0; i <ar.size(); i++) {
	System.out.println(ar.get(i).getName()+"\t\t"+ar.get(i).getId()+"\t\t"+ar.get(i).getSaL());
}
Collections.sort(ar,(a1,a2)->
{
	return a1.getSaL().compareTo(a2.getSaL());
});
System.out.println("\t\t!!!Sort By Salary");
System.out.println("Name\t\tId\t\tSalary");
System.out.println("=====\t\t=======\t\t=======");
for (int i = 0; i < ar.size(); i++) {
	System.out.println(ar.get(i).getName()+"\t\t"+ar.get(i).getId()+"\t\t"+ar.get(i).getSaL());
	
}

}
}