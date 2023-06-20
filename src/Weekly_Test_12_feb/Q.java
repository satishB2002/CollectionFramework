package Weekly_Test_12_feb;
/*9. Write a Java program to get the portion of a map whose keys are strictly less than a
given key using TreeMap.*/

import java.util.TreeMap;

public class Q {
public static void main(String[] args) {
	TreeMap<Integer, String> hs=new TreeMap();
	hs.put(111, "vvbdsh");
	hs.put(211, "vcbshb");
	hs.put(131, "vvbsksh");
	hs.put(191, "vckjnk");
	hs.put(411, "vabcbal");
	System.out.println("strictly less than key");
	System.out.println(hs.lowerKey(131));
}
}
