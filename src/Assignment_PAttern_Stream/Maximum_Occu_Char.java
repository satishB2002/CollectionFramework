package Assignment_PAttern_Stream;
/*
Write a Java program to find the maximum occurring character in a string


The given string is: test string
Max occurring character in the given string is: t
*/
public class Maximum_Occu_Char {
public static void main(String[] args) {
	String Str="test string";
	char[] S1=Str.toCharArray();
	int i,j;
	int c;
	int max_occ=0;
	int freq=0;
	for ( i = 0; i < S1.length; i++) {
		c=0;
		for (j = i+1; j < S1.length; j++) {
		if(S1[i]==S1[j])
		{
			c++;
		}
			
		}
		if(c>max_occ)
		{
			max_occ=c;
			freq=S1[i];
			
		}
	}
	System.out.println("Max Occurace is="+(char)freq);
}
}
