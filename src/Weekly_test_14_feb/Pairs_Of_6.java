package Weekly_test_14_feb;
//5. Count pairs with given sum
//Input:
//arr[] = {1, 5, 7, -1}, sum = 6
//Output: 2
//Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
//Input:
//arr[] = {1, 5, 7, -1, 5}, sum = 6
//Output: 3
//Explanation: Pairs with sum 6 are (1, 5), (7, -1) &amp; (1, 5)

public class Pairs_Of_6 {
public static void main(String[] args) {
	int a[]= {1, 5, 7, -1};
	int sum=6;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]+a[j]==sum) {
				
				System.out.println("Yours Pair Are="+a[i]+" "+a[j]);
			}
		}
	}
}
}
