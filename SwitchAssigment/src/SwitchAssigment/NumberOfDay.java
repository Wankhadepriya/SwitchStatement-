package SwitchAssigment;
import java.util.Scanner;
public class NumberOfDay
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	      Scanner sc =new Scanner(System.in);
		  System.out.println("Enter the month name : ");
		  String month = sc.next();
		  
			switch(month)
			{
				case "January" , "january" , "jan":
				case "March" , "march":
				case "June" , "june":
				case "August" , "august":
				case "October" , "october": 
				case "December" , "december":
					     System.out.println("Total number of days in month is 31"); 
						 break;
				
				case "Febuary" , "febuary" , "feb": 
					    System.out.println("Total number of days in month is 28/29");
				        break;
				 
				case "April" , "april":
				case "May" , "may":
				case "July" , "july":
				case "September" , "september": 
			    case "November" , "november":
					System.out.println("Total number of days in month is 30");
						break;
				}

		}

}

