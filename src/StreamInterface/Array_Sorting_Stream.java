package StreamInterface;

import java.util.Iterator;
import java.util.stream.Stream;

public class Array_Sorting_Stream {
	public static void main(String[] args) {
		
	
Stream<String> ss=Stream.of("Satish","Danver","Pune ","Om","Sathe","In","Pune");
	//printing by method reference operator or scope resolution operator

	//ss.forEach(System.out::println);
//printing by lamda exprssion
		ss.forEach(city->System.out.println(city));
	

}

	
}


