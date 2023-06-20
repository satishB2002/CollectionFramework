package Assignment_TreeMap;
/*16. Write a Java program to get a key-value mapping associated with the
greatest key strictly less than the given key. Return null if there is no such
key.*/
import java.util.TreeMap;

public class Q16 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<>();
	tm.put(121, "dcsgkya");
	tm.put(131, "hcshl");
	tm.put(141, "chu");
	tm.put(151,"clui");
	System.out.println(tm.lowerKey(131));
}
}
