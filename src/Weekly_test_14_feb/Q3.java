package Weekly_test_14_feb;
//Q3.Write a program to take a number as an argument and check it is palindrome or not, if
//the number is palindrome then return true else return false
//
//using lambda expression.
interface pqr
{
	boolean Satish(Integer no);
}
public class Q3 {
public static void main(String[] args) 
{
	
	pqr pq =(no)->
	{
		
		int rem ,rev=0;
		int t=no;
		while(t!=0)
		{
		rem=t%10;
		rev=rev*10+rem;
		t=t/10;
		}
		if(rev==no)
		
			 return true;
		else
		     return false;
		
	};
	System.out.println(pq.Satish(111));
	
}
}
