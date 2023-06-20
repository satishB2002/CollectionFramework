package StreamInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.html.InlineView;

public class Class_main {
	public static void main(String[] args) {
		
	
ArrayList<Encapsulation_class> ar=new ArrayList();
ar.add(new Encapsulation_class(7, "Satish", 12344.0));
ar.add(new Encapsulation_class(2, "Shubham", 236551.0));
ar.add(new Encapsulation_class(3, "Pravin", 123654.0));
ar.add(new Encapsulation_class(4,"Yatesh", 41253.0));
ar.add(new Encapsulation_class(5, "Vipul", 42361.0));
ar.add(new Encapsulation_class(6,"Guru", 145236.0));
ar.add(new Encapsulation_class(1,"Sagar", 654135.00));
System.out.println("Sorting By Name");
//Collections.sort(ar, (a1,a2)->
//{
//	return a1.getName().compareTo(a2.getName());
//});
//for (Encapsulation_class ab : ar) {
//	System.out.println(ab.getName()+" "+ab.getId()+" "+ab.getSal());
//}
//System.out.println("Sorting By Salary");
//Collections.sort(ar, (c1,c2)->
//{
//	return c1.getSal().compareTo(c2.getSal());
//});
//for (Encapsulation_class ab : ar) {
//	System.out.println(ab.getName()+" "+ab.getId()+" "+ab.getSal());
//}
//System.out.println("Sorting By Id");
//Collections.sort(ar, (c1,c2)->
//{
//	return c1.getId().compareTo(c2.getId());
//});
//for (Encapsulation_class ab : ar) {
//	System.out.println(ab.getName()+" "+ab.getId()+" "+ab.getSal());
//}
System.out.println("=========================================================================================");
System.out.println("\tSort Name");
   List<Encapsulation_class> Sortedbyname =ar.stream()
		   .sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
		   .collect(Collectors.toList());
   			Sortedbyname.forEach(System.out::println);
   			System.out.println("=========================================================================================");
   			System.out.println("\tSort Id");
   			List<Encapsulation_class> Sortedbyname1 =ar.stream()
   					.sorted((Comparator.comparingInt(Encapsulation_class::getId)))
   					.collect(Collectors.toList());
   			Sortedbyname1.forEach(System.out::println);
   			System.out.println("=========================================================================================");
   			System.out.println("\tSort Sal");
   			List<Encapsulation_class> Sortedbyname2 =ar.stream()
   					.sorted((Comparator.comparingDouble(Encapsulation_class::getSal)))
   					.collect(Collectors.toList());
   			Sortedbyname2.forEach(System.out::println);
   			

}
}
