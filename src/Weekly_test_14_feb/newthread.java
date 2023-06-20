package Weekly_test_14_feb;
//4. Write java program to find Second Largest element in an array without using
//Arrays.sort()
//For input: 4,5,8,9,7,9,5,2
//Output: 8
//For input: -4,-5,-8,-9,-7,-9,-5,-2
//Output: -4

public class newthread {
public static void main(String[] args) {
	int a[]= {4,5,8,9,7,9,5,2};
	int t=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]>a[j]) 
				
				{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
				
			
		}
	}
	System.out.println("Your Second Largest Element="+a[2]);
}
}
