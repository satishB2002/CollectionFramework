package Assignment_PAttern_Stream;
/*3  Write a program to iterate the HashMap  through foreach Method.
using custom consumer.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Consumer;

class PrintConsume implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}

public class Q12 {
public static void main(String[] args) {
	ArrayList<Integer> hs=new ArrayList(Arrays.asList(11,22,33,55,44,66));
	System.out.println("Custom Interface");
	hs.forEach(new PrintConsume());
}
}
