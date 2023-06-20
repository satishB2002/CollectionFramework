package Tree_Map;

import java.util.Map;
import java.util.TreeMap;

public class Ex_TreeMap {
public static void main(String[] args) {
	TreeMap<Integer, String > tm=new TreeMap();
	tm.put(41, "D");
	tm.put(81, "L");
	tm.put(31, "H");
	tm.put(11, "M");
	TreeMap<Integer, String > tm1=new TreeMap();
	tm1.put(7, "P");
	tm1.put(8, "Y");
	tm1.put(3, "E");
	tm1.put(1, "J");
	//System.out.println("Clear Method");
   // tm.clear();
	//System.out.println(tm);

	//System.out.println("Clear Method");
	//tm.clear();
	//System.out.println(tm);
	//for (Map.Entry< Integer, String> entry : tm.entrySet()) {
	//	System.out.println(entry.getKey()+"      "+entry.getValue());
	//}
	System.out.println("\tGet Key Method");
	System.out.println(tm.get(31));
	System.out.println("\tGet Value Method");

	System.out.println(tm.values());
	System.out.println("\tkeySet");
	System.out.println(tm.keySet());
	System.out.println("\tReplace Methood");
	System.out.println(tm.replace(11, "O"));
	System.out.println(tm);
	System.out.println("\tDescending Order");
	System.out.println(tm.descendingKeySet());
	System.out.println("\tContains Value Method");
    System.out.println(tm.containsValue(tm));
	System.out.println("\tceilingKey Method");
    System.out.println(tm.ceilingKey(32));
	System.out.println("\tcontainsValue Method");
	System.out.println(tm.containsValue(66));
	
	System.out.println("\tfirstKey Method");
	System.out.println(tm.firstKey());
	System.out.println("\tLastEnteryMethod");
	System.out.println(tm.lastEntry());
	System.out.println("\thigherEntery");
	System.out.println(tm.higherEntry(14));
	System.out.println(tm.remove(11, tm));
	System.out.println("\tremove Method");
	tm.remove(11);
	System.out.println(tm);
	tm.putAll(tm);
	System.out.println(tm);
	
	
   
	
	
}
}

