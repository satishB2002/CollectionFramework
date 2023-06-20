package Assignment_PAttern_Stream;
/*
0
505
45054
3450543
234505432
12345054321
*/
public class Q6 {
	public static void main(String[] args) {
		int i,j;
		System.out.print(0+"\n");
		for ( i = 5; i >=1; i--) {
			for ( j =i; j <=5; j++) {
				System.out.print(j);
			}
			for ( j = 1; j <=1; j++) {
				System.out.print(0);
			}
			
				for ( j =5; j >=i; j--) {
					System.out.print(j);
				}
			System.out.println();
		
	}

	}
}
