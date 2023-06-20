package BiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

class Printingbiconsumer implements BiConsumer<Integer, String>
{

	@Override
	public void accept(Integer t, String u) {
		System.out.println(t+" "+u);
		
	}
}
public class Ex_ForEach_HasMap {
public static void main(String[] args) {
	Map<Integer,String> mp=new HashMap();
	mp.put(8, "Abc");
	mp.put(6, "NMB");
	mp.put(4, "KJH");
	mp.put(1, "PLK");
	mp.put(9, "UJN");
	
	System.out.println("\t!!Adavance Foreach Biconsumer Interface!!");
	mp.forEach(new Printingbiconsumer() );
	System.out.println("\t!!Single Line Lamda Exp Biconsumer Interface!!");
    mp.forEach((k,n)-> System.out.println(k+" "+n) );
    
	
	System.out.println("\t!!Simple Biconsumer Interface!!");
	mp.forEach(new Printingbiconsumer()
	{
		@Override
		public void accept(Integer t, String u) {
			System.out.println(t+" "+u);
			
		}
	});
	System.out.println("\t!!Lamda With CurleExp Biconsumer Interface!!");
	mp.forEach((k,l)->
	{
		System.out.println(k+" "+l);
	});
		
	
}
}
