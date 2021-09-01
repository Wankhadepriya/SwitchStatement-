package SwitchAssigment;
import java.util.Scanner;

public class DayNotExist {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the day  : ");
		  int day= sc.nextInt();
		
		 switch(day)
		 {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7: 
					 System.out.println("day exist");
					 break;
			default : System.out.println("error, day does not exist");
		 }

	

	}

}
