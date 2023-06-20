package LamdaExpression;

import java.util.ArrayList;
import java.util.Arrays;

public class Single_Lamda_Printing {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList(Arrays.asList(111,222,333,444,555));
	System.out.println("Printing Lamda Exprssion!!");
	al.forEach(n->System.out.println(n));
}
}
