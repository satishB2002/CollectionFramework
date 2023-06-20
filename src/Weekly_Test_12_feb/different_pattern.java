package Weekly_Test_12_feb;

public class different_pattern
{
  public static void main(String[] args) 
  {
	  for(int i=1;i<=7;i++)
	  {
		  for(int j=1;j<=7;j++)
		  {
			  if(j==1)
			  {
				  System.out.print("*");
			  }
			  else if (i==2&j==2||i==3&j==2||i==4&j==2||i==5&j==2||i==6&j==2||i==3&j==4||i==5&j==4||i==4&j==6)
			  {
				  System.out.print("1");
				
			  }
			  else if (i==2&j==3||i==6&j==2||i==3&j==5||i==5&j==5||i==4&j==7||i==6&j==3)
			  {
				  System.out.print("*");
				  
 			  }
			  else if (i==2&j==3||i==3&j==3||i==4&j==3||i==4&j==5||i==5&j==3)
			  {
				  System.out.print("2");
				
			  }
			  else if (i==4&j==4)
			  {
				  System.out.print("3");
				
			}
			  
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
				  
	  }
	
}
}
