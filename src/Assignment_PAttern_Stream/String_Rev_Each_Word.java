package Assignment_PAttern_Stream;
/*. Write a Java program to reverse every word in a string using methods.  Return Type Methods
The given string is: This is a test string
The string reversed word by word is: 
sihT si a tset gnirts*/

public class String_Rev_Each_Word {
public static void main(String[] args) {
	String Str="This is a test string";
	String a[]=Str.split(" ");
	for(int i=0;i<a.length;i++)
	{
		StringBuffer sb=new StringBuffer(a[i]);
		System.out.print(sb.reverse()+" ");
	}
	
	
	
		
	
}
}
