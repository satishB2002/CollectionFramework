package Map_Interface;

import java.util.HashMap;

//1. Write a Java program to associate the specified value with the specified key in
//a HashMap.
public class Q1 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("SACB",111);
	hm.put("ACBJ",151);
	hm.put("KACB",131);
	hm.put("POCB",121);
	hm.put("MJCB",171);
	System.out.println(hm.get("MJCB"));
}
}
