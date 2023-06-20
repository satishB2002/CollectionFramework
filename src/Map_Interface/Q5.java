package Map_Interface;

import java.util.HashMap;

//5. Write a Java program to check whether a map contains key-value mappings (Empty)or not
public class Q5 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(147, 'l');
	hm.put(147, 'o');
	hm.put(147, 'p');
	System.out.println(hm.containsKey(hm));
}


}
