package SwitchAssigment;

import java.util.Scanner;

public class GreaterNumber 
{
	
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the two number :");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			switch(a/b)
			{
			case 1: System.out.println("First number is greater : " +a);
					break;
			default: System.out.println("Second number is greater : " +b);		
			}
			

		 }

}



