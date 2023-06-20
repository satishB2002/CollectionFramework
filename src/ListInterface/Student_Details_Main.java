package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
/*WAP to store students details of JU university
Field should be: 
id,name,email,username,password,city,state,zip-code, country

Use ArrayList to store the data of students, make encapsulate class for students.*/
public class Student_Details_Main {
public static void main(String[] args) {
	
	ArrayList ar=new ArrayList();
	ar.add(new Student_Details (11, "abc@gmail","a", 0101, "akole", "Maharashtra", 422610, "India"));
	ar.add(new Student_Details (11, "qwe@gmail","b", 0001, "nashik", "Maharashtra", 522610, "India"));
	ar.add(new Student_Details (11, "poi@gmail","c", 0101, "pune", "panjab", 622610, "India"));
	ar.add(new Student_Details (11, "mnb@gmail","d", 0101, "mumbai", "karnatak", 922610, "India"));
	Iterator itr =ar.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
