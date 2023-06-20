package Weekly_Test_12_feb;

public class Pattern_No {
public static void main(String[] args) {
	int m;
	
	for (int i = 1; i <=4; i++) {
		m=1;
		for (int j = 0; j <=i; j++) {
			System.out.print(i*m+" ");
			m=m*2;
		}
		System.out.println();
	}
}
}
