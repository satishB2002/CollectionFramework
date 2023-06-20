package ArrayListAssignment;
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection. 
/*Red. #FF0000.
Blue. #0000FF.
Green. #006400.
Orange. #FF6600.
White. #FFFFFF.
Black. #000000.
Yellow. #FFFF00.
Purple. #A020F0*/
import java.util.ArrayList;

public class Q1 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add("Red");
	ar.add("Blue");
	ar.add("Green");
	ar.add("Orange");
	ar.add("White");
	ar.add("Black");
	ar.add("Yellow");
	ar.add("Purple");
	System.out.println(ar);
	
}
}
