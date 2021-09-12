package Loops;
import java.util.Scanner;

public class BreakStatement {
	
	public static void main(String argd[])
	{
		
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Number");
	   int no= sc.nextInt();
	
	   for(int i=1; i<=no; i++)
	   {   
		  
		   System.out.println(" before break");
		   break;
        }

	   System.out.println("After break");
}
}

