package Assignment_PAttern_Stream;
/*
1 # #
$ 1 #
$ $ 1
*/

public class Q5 {
public static void main(String[] args) {
	for (int i =1; i <=3; i++) {
		for (int j = 1; j <=3; j++) {
			if(i==j)
			System.out.print(1+" ");
			else if(i>j)
				System.out.print("$"+" ");
			else if(i<j)
				System.out.print("#"+" ");
		}
		System.out.println();
	}
}
}
