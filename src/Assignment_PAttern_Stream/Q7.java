package Assignment_PAttern_Stream;
/*
1
4 1
9 4 1
16 9 4 1
25 16 9 4 1
*/
public class Q7 {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = i; j >=1; j--) {
			
			System.out.print(j*j+" ");
			
		}
		System.out.println();
	}
}
}
