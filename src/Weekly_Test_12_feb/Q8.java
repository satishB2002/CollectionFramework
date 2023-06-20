package Weekly_Test_12_feb;

import java.util.HashMap;

//8. Write a Java program to get a shallow copy of a HashMap instance.

public class Q8 {
public static void main(String[] args) {
	HashMap<Integer, String> hs=new HashMap();
	hs.put(11, "Abc");
	hs.put(12, "Kbc");
	hs.put(13, "Lbc");
	hs.put(41, "Rbc");
	hs.put(61, "Obc");
	hs.put(91, "Ybc");
	HashMap <Integer, String> hs1=(HashMap<Integer, String>) hs.clone();
	System.out.println(hs1);
	
}
}
