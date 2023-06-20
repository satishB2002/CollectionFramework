package LamdaExpression;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.function.Consumer;

class PrintForeach implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}
public class Custom_Interface  {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList(Arrays.asList(11,22,44,55,77));
	System.out.println("Custom Consumer InterFace");
	al.forEach(new PrintForeach());
}

}
