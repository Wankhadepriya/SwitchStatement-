package SwitchAssigment;

import java.util.Scanner;

public class DaysInWeek 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a Day:");
		Scanner sc = new Scanner(System.in);
		char day = sc.nextLine().charAt(0);
		switch(day) 
		{
		  case '1':
			  System.out.println("Monday");
			  break;
		  case '2':
			  System.out.println("Tuesday");
			  break;
		  case '3':
			 System.out.println("Wednesday");
			 break;
		  case '4':
			 System.out.println("Thursday");
			 break;
		  case '5':
			 System.out.println("Friday");
			 break;
		   case '6':
		     System.out.println("Saturday");
		     break;
		  case '7':
			 System.out.println("Sunday");
			 break;
		 default:
			System.out.println("Invalid Entry..! ");
			break;

	    }

	}
}
