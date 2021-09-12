package SwitchAssigment;
import java.util.Scanner;

public class CalculatorS
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		   
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the two numbers: ");
		   
		 int no1= sc.nextInt();
	     int no2 =sc.nextInt();
		 
	     System.out.print("Enter the opeartion : ");
		 String s = sc.next();
		   
		 switch(s)
		 {
		    case "add":
		    	  System.out.println("Number1+Number2= " + (no1+no2));
		    	  break;
		    case "sub": 
		    	  System.out.println("Number1-Number2= " + (no1-no2));
		    	   break;
		    case "mul":
		    	   System.out.println("Number1*Number2= " + (no1*no2));
		    	  	break;
		    case "div": 
		    	   System.out.println("Number1/Number2= "+ (no1/no2));
		    				break;
		    case "mod": 
		           System.out.println("Number1%Number2 = "+ (no1%no2));
		    					break;
		    default:
		    	break;
		    }
		

 	   }

		
}
