package Map_Interface;

import java.util.HashMap;

//4. Write a Java program to remove all of the mappings from a map.
public class Q4 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("ANKJNJ", 7485);
	hm.put("IUYYT", 7785);
	hm.put("PLMK", 7475);
	hm.put("QWEE", 7487);
	hm.clear();
	System.out.println(hm);
}
}
