package Assignment_PAttern_Stream;
/*
1
2*3
4*5*6
7*8*9*10
4*5*6
2*3
1
*/
public class Q4_Q {
public static void main(String[] args) {
	int k=1,i,j;
	for ( i =1; i <5; i++) {
		for (j = 1; j <=i; j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
		
	}
	
	}
}
