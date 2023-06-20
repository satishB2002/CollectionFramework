package Map_Interface;

import java.util.Hashtable;

public class Ex_Methods_Hashtable {
public static void main(String[] args) {
	Hashtable ht=new Hashtable();
	ht.put(12, "Satish");
	ht.put(13, "Barate");
	ht.put(14, "Pune");
	ht.put(18, "Sangamner");
	Hashtable ht1=new Hashtable();
	ht1.put(12, "Satish");
	ht1.put(13, "Barate");
	ht1.put(14, "Pune");
	ht1.put(18, "Sangamner");
	System.out.println("\t Hashtable");
	System.out.println(ht);
	System.out.println("\tget Method");
	System.out.println(ht.get(14));
	System.out.println("\tgetOrDefault");
	System.out.println(ht.getOrDefault(74, "Waghapur"));
	System.out.println("\tkeySet Method");
	System.out.println(ht.keySet());
	System.out.println("\tvaluesMethod");
	System.out.println(ht.values());
	System.out.println("\tputIfAbsent Method");
	System.out.println(ht.putIfAbsent(14, "asdf"));
	// equals Methods
	System.out.println(ht.equals(ht1));
	// is empty Method
	System.out.println(ht.isEmpty());
	// put All Method
	ht.putAll(ht1);
	System.out.println(ht);
	//contains value Method
	System.out.println(ht.containsValue(ht1));
	//remove Method
	System.out.println(ht.remove(ht1));
	

}
}