package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpMain {
public static void main(String[] args) {
	Emp ss=new Emp();
	ss.setId(11);
	ss.setName("Satish");
	ss.setSal(25000);
	Emp ss1=new Emp();
	ss1.setId(12);
	ss1.setName("Sagar");
	ss1.setSal(35000);
	Emp ss2=new Emp();
	ss2.setId(13);
	ss2.setName("Tejas");
	ss2.setSal(35000);
	Emp ss3=new Emp();
	ss3.setId(14);
	ss3.setName("Jack");
	ss3.setSal(50000);
	Emp ss4=new Emp();
	ss4.setId(15);
	ss4.setName("Hardik");
	ss4.setSal(60000);
	Emp ss5=new Emp();
	ss5.setId(16);
	ss5.setName("Mark");
	ss5.setSal(70000);
	ArrayList ar=new ArrayList();
	ar.add(ss);
	ar.add(ss1);
	ar.add(ss2);
	ar.add(ss3);
	ar.add(ss4);
	ar.add(ss5);
	
	
		Iterator itr =ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
}
}
