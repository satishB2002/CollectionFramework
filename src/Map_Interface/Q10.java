package Map_Interface;

import java.util.HashMap;

//10. Write a Java program to get the value of a specified key in a map.
public class Q10 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(14.0, "Satish");
	hm.put(15.0, "AVFG");
	hm.put(16.0, "PLMK");
	hm.put(17.0, "YUIO");
	System.out.println(hm.get(17.0));
}
}
