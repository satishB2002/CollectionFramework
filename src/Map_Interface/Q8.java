package Map_Interface;

import java.util.HashMap;

//8. Write a Java program to test if a map contains a mapping for the specified
//value.
public class Q8 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("SSSS", 74);
	hm.put("SBNH", 75);
	hm.put("OKSS", 76);
	hm.put("DERS", 77);
	hm.put("WEES", 78);
	System.out.println(hm.containsValue(74));
}
}
