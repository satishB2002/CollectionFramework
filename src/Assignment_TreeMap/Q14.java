package Assignment_TreeMap;

import java.util.TreeMap;

/*14. Write a Java program to get the portion of this map whose keys are less
than (or equal to, if inclusive is true) a given key.*/
public class Q14 {
public static void main(String[] args) {
	TreeMap<Character, String> tm=new TreeMap<>();
	tm.put('D', "Satish");
	tm.put('O', " nhjbhj");
	tm.put('L', "Sjhbjh");
	tm.put('Q', "Snkjn");
	tm.put('Y', "jknzd");
	tm.put('V', " mzbx");
	System.out.println(tm.floorKey('Q'));
}
}
