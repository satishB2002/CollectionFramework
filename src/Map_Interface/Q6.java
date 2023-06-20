package Map_Interface;

import java.util.HashMap;

//6. Write a Java program to get a shallow copy of a HashMap instance.
public class Q6 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("Satish", 52);
	hm.put("SKJH", 53);
	hm.put("POOIU", 54);
	hm.put("STGFV", 55);
	HashMap hm1=(HashMap)hm.clone();
	System.out.println(hm1);

	
}
}
