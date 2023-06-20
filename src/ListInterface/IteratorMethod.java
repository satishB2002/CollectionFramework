package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorMethod {
public static void main(String[] args) {
ArrayList ar=new ArrayList();
ar.add(10);
ar.add("Satish");
ar.add('S');
ar.add(582.0f);
ar.add(10.5);
ar.add(100);
ar.add(200);
ar.add(300);
Iterator itr =ar. iterator();
System.out.println("Iterator Method ::");
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
