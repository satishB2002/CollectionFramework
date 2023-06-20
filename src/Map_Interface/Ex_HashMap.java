package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Ex_HashMap {
public static void main(String[] args) {
	HashMap<Integer ,String> hm=new HashMap<Integer ,String>();
	hm.put(147, "ABCD");	
	hm.put(157, "PQR");
	hm.put(167, "MNB");
	HashMap hm1=new HashMap();
	hm1.put(147, "KUTT");
	hm1.put(157, "FGJV");
	hm1.put(167, "LKJH");
	System.out.println("Key \tValue");
	for (Map.Entry< Integer, String> entry : hm.entrySet()) {
		System.out.println(entry.getKey()+"      "+entry.getValue());
	}
	System.out.println(hm);
	System.out.println("\tget Method");
	System.out.println(hm.get(157));
	System.out.println("\tcontainsKey Method");
	System.out.println(hm.containsKey(hm1));
	System.out.println("\tputAll Method");

	hm.putAll(hm1);
	System.out.println(hm);
	System.out.println("\tputAll Method");
	
	hm.putAll(hm1);
	System.out.println(hm);
}
}
