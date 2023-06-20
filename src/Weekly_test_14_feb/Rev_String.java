package Weekly_test_14_feb;
//2. Write a java program
//Input: My NaMe iS XyzEe
//Output: EeZYx Si EmAn Ym
public class Rev_String {
public static void main(String[] args) {
	String s="My NaMe iS XyzEe";
	StringBuffer sf=new	StringBuffer(s);
	sf.reverse();
	//System.out.println(sf);
	String sb=sf.toString();
	
	
	
	String k[]=sb.split(" ");
	for (int i = 0; i < k.length; i++) {
		char d[]=sb.toCharArray();
		System.out.println(Character.toUpperCase(d[0]));
		for (int j = 1; j <d.length; j++) {
			System.out.print(d[j]);

		}
		System.out.print(" ");
	}
//	String b[]=str.split(" ");
//	
//	for(int i=0;i<b.length;i++)
//	{
//		char c[]=b[i].toCharArray();
//		System.out.print(Character.toUpperCase(c[0]));
//		for(int j=1;j<b.length;j++)
//		{
//			
//		System.out.print(b[j]);
//		}
//		System.out.print(" ");
//	}
	
	
}
}
