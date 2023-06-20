package Assignment_PAttern_Stream;

public class Q8 {
	/*
	1 
	1 4 
	1 8 27 
	1 16 81 256
	*/
public static void main(String[] args) {
	for (int i =1; i <=4; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print((int)Math.pow(j, i)+" ");
		}
		System.out.println();
	}
}
}
