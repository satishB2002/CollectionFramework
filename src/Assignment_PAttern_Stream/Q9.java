package Assignment_PAttern_Stream;
/*
I
I Like
I Like Very
I Like Very Much
I Like Very Much Java
*/
public class Q9 {
	public static void main(String[] args) {
int i,j;

String Str="I Like Very Much Java";
String S1[]=Str.split(" ");
for ( i = 0; i < S1.length; i++) {
	for ( j = 1; j <=5; j++) {
		for (int k = 1; k <=j; k++) {
			System.out.print(S1[k-1]+" ");
		}
		System.out.println();
		
	}
	break;
}
	}
}
