package Vector;
//17. Java program to get the enumeration of the values present in the Vector

import java.util.Enumeration;
import java.util.Vector;

public class Q17 {
public static void main(String[] args) {
	 Vector < String > vec = new Vector < String > ();

	    vec.add("CAR");
	    vec.add("BUS");
	    vec.add("BIKE");
	    vec.add("TRUCK");

	    Enumeration<String> enu = vec.elements();

	    System.out.println("The enumeration of values are:");
	    while (enu.hasMoreElements()) {
	      System.out.println(enu.nextElement());
	    }
}
}
