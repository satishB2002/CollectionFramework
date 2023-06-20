package Map_Interface;

import java.util.HashMap;

//3. Write a Java program to copy all of the mappings from the specified map to another map
public class Q3 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("SDFG", 145);
	hm.put("POFG", 155);
	hm.put("PLFG", 165);
	hm.put("TYFG", 175);
	HashMap hm1=new HashMap();
	hm1.put("TGVG", 175);
	hm1.put("IKFG", 155);
	hm1.put("MKFG", 166);
	hm1.put("WSFG", 179);
	hm.containsValue(hm1);
	System.out.println(hm);
}
}
