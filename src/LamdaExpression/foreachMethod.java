package LamdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class foreachMethod {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList(Arrays.asList(11,33,22,55,88,99));
	al.forEach(new Consumer<Integer>() {

	
		
		public void accept(Integer t) {
			
			System.out.println(t);
			
		}
		
	});
}
}
