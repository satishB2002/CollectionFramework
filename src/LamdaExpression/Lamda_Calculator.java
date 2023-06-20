package LamdaExpression;

import java.util.Scanner;

interface cal
{
	double Calculation(double x,double y);
}
public class Lamda_Calculator {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("\t\tCalculator");
	System.out.println("Enter 1 To Sum");
	System.out.println("Enter 2 To Sub");
	System.out.println("Enter 3 To mul");
	System.out.println("Enter 4 To div");
	System.out.println("Enter Your Choice");
	int n=sc.nextInt();
	switch(n)
	{
		case 1:
		{
	cal sum=(x,y)->
	{
		return x+y;
		
	};
	
		
	System.out.println("Sum Of No="+sum.Calculation(15, 20));
	break;
		}
		case 2:
		{
	cal sub=(x,y)->
	{
		return x-y;
		
	};
	System.out.println("Sub Of No="+sub.Calculation(15, 20));
	break;
		}
		case 3:
		{
	cal mul=(x,y)->
	{
		return x*y;
		
	};
		
	System.out.println("Mul Of No="+mul.Calculation(15, 20));
	break;
		}
		case 4:
		{
	cal div=(x,y)->
	{
		return x/y;
		
	};
	System.out.println("Division Of No="+div.Calculation(15, 20));
	break;
		}
		default :
			System.out.println("Wrong Choice Enter Valid Operation");
}
}

private static void Switch(int n) {
	// TODO Auto-generated method stub
	
}
}
