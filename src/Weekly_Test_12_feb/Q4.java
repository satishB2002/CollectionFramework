package Weekly_Test_12_feb;
/*4. Given three arrays sorted in non-decreasing order, print all common elements in these
arrays. Examples:
Input: ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {1, 5, 10, 20, 40, 80}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Sample Output: 20, 80*/
public class Q4 {
public static void main(String[] args) {
	int a[]={1, 5, 10, 20, 40, 80};
	int b[]= {1, 5, 10, 20, 40, 80};
	int c[]={3, 4, 15, 20, 30, 70, 80, 120};
	int i,j,k;
	for ( i = 0; i < a.length; i++) {
		for ( j = 0; j < b.length; j++) {
		for ( k = 0; k < c.length; k++) {
			if(a[i]==b[j] && a[i]==c[k])
			System.out.println(a[i]);
			
		}
		}
	}

}
}
