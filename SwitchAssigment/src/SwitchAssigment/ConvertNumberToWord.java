package SwitchAssigment;
import java.util.Scanner;

public class ConvertNumberToWord 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				  System.out.println("Enter the number between 1 to 5: ");
				  int number = sc.nextInt();
				  
				  switch(number) 
				  {
				  case 1: 
					  System.out.println("One");
				  	 break; 
				  case 2: 
					  System.out.println("Two");
				  	  break;
				  case 3:
					  System.out.println("Three");
				  	  break;
				  case 4: 
					  System.out.println("Four");
				  	  break;
				  case 5: 
					  System.out.println("Five");
				      break;
					  
				  }
				  
	}

}
